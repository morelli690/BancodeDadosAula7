package com.htcursos.bancodedadosaula7.activities;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.htcursos.bancodedadosaula7.R;
import com.htcursos.bancodedadosaula7.adapters.UserListAdapter;
import com.htcursos.bancodedadosaula7.helpers.UserDAO;
import com.htcursos.bancodedadosaula7.utils.Constants;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 *  Como fazer>>> http://stackoverflow.com/questions/10407159/how-to-manage-startactivityforresult-on-android
 * Created by Cesar on 07/05/2016.
 */
public class MainActivity extends AppCompatActivity {
    @BindView(R.id.list_view)
    ListView listview;
    @BindView(R.id.btn_register)
    Button button;

    private UserListAdapter adapter;
    UserDAO userDAO = new UserDAO(this);
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        userDAO = new UserDAO(MainActivity.this);

        if(userDAO.getAll().isEmpty()){
            Toast.makeText(MainActivity.this, "Cadastre um usuario!!", Toast.LENGTH_SHORT).show();
        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              startActivity(new Intent(MainActivity.this,RegisterActivity.class));
            }
        });
        listview.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, final int position, long id) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Excluir usuario")
                        .setMessage("Deseja realmente excluir o usuário?")
                        .setNegativeButton("Não", null)
                        .setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                userDAO = new UserDAO(MainActivity.this);

                                userDAO.remove(adapter.getItem(position));
                                updateList();
                            }
                        }).show();
                return true;
             }
        });
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                userDAO = new UserDAO(MainActivity.this);

           //     userDAO.update(adapter.getItem(position));
                Intent intent= new Intent(MainActivity.this,RegisterActivity.class);

                intent.putExtra(Constants.EXTRA_FOR_B, adapter.getItem(position));
                startActivity(intent);
            }
        });

    }

    public void updateList(){
        UserDAO userDAO = new UserDAO(this);
        adapter =new UserListAdapter(this, userDAO.getAll());
        listview.setAdapter(adapter);
        if(userDAO.getAll().isEmpty()){
            Toast.makeText(MainActivity.this, "Cadastre um usuario!!", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onResume() {
        super.onResume();
        updateList();
    }
}

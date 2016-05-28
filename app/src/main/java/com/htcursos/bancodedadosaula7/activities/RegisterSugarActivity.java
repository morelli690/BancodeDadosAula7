package com.htcursos.bancodedadosaula7.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.htcursos.bancodedadosaula7.R;
import com.htcursos.bancodedadosaula7.helpers.UserDAO;
import com.htcursos.bancodedadosaula7.models.User;
import com.htcursos.bancodedadosaula7.models.UserSugar;
import com.htcursos.bancodedadosaula7.utils.Constants;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * Created by Cesar on 30/04/2016.
 */
public class RegisterSugarActivity extends AppCompatActivity {
    @BindView(R.id.Nome)
    EditText Nome;
    @BindView(R.id.Email)
    EditText Email;
    @BindView(R.id.botao1)
    Button btn1;
    @BindView(R.id.botao2)
    Button btn2;

    String string = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2_resposta_aula_5);
        ButterKnife.bind(this);
        Constants.EXTRA_FOR_B=new String();
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        if(getIntent().getExtras() != null) {
            string = getIntent().getExtras().get(Constants.EXTRA_FOR_B).toString();
            String[] parts = string.split("-abobora-");
            String part1 = parts[0]; // 004
            String part2 = parts[1];
            String part3 = parts[2];
            Nome.setText(part2);
            Email.setText(part3);
        }


    }

    @OnClick(R.id.botao2)
    public void registerUser() {

        String nome = Nome.getText().toString();
        String email = Email.getText().toString();

        if (!TextUtils.isEmpty(nome) && !TextUtils.isEmpty(email)) {
            UserSugar user = new UserSugar();
            user.setName(nome);
            user.setEmail(email);
            user.save();
            Toast.makeText(RegisterSugarActivity.this, "Usuario salvo!", Toast.LENGTH_SHORT).show();
//            if(getIntent().getExtras() != null){
//                String string = getIntent().getExtras().get(Constants.EXTRA_FOR_B).toString();
//                String[] parts = string.split("-abobora-");
//                String part1 = parts[0]; // 004
//                Long id=  Long.parseLong( part1 );
//                user.setId(id);
//                user.(user);
//                Toast.makeText(RegisterSugarActivity.this, "Usuario alterado com sucesso!", Toast.LENGTH_SHORT).show();
//            }else{
//            userDAO.add(user);
//
//                Toast.makeText(RegisterSugarActivity.this, "Usuario salvo!", Toast.LENGTH_SHORT).show();
//            }
//
//
//            finish();
//        } else {
//            Toast.makeText(RegisterSugarActivity.this, "Usuario nao salvo!", Toast.LENGTH_SHORT).show();
        }
    }
}

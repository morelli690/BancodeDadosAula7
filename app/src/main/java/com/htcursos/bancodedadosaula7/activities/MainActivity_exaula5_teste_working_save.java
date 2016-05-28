package com.htcursos.bancodedadosaula7.activities;//package com.htcursos.aula5.activities;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.view.View;
//import android.widget.Button;
//import android.widget.ListView;
//
//import com.htcursos.aula5.R;
//import com.htcursos.aula5.adapters.UserListAdapterExAula5;
//import com.htcursos.aula5.models.UserExAula5;
//import com.htcursos.aula5.utils.Constants;
//
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.List;
//
//import butterknife.BindView;
//import butterknife.ButterKnife;
//
///**
// *  como fazer>>> http://stackoverflow.com/questions/10407159/how-to-manage-startactivityforresult-on-android
// * Created by Cesar on 07/05/2016.
// */
//public class MainActivity_exaula5_teste_working_save extends AppCompatActivity{
//    @BindView(R.id.list_view)
//    ListView listview;
//    @BindView(R.id.btn_register)
//    Button button;
////    @BindView(R.id.user_name)
////    TextView username;
////    @BindView(R.id.email)
////    TextView email;
//
//    private UserExAula5 user;
//    private int number = 0;
////    private static final String[] NAMES = new String[]    {
////        "JAO",
////                "MARIA",
////                "JOSE"
////    };
//
////
////    @Override
////    public void onCreate(Bundle savedInstanceState) {
////        super.onCreate(savedInstanceState);
////        setContentView(R.layout.activity_main);
////        ButterKnife.bind(this);
////        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, NAMES);
////        listview.setAdapter(adapter);
////        listview.setOnItemClickListener(new AdapterView.OnItemClickListener(){
////            @Override
////            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
////                String text = String.format("Clique no item %s",NAMES[position]);
////                Toast.makeText(MainActivityB.this,text,Toast.LENGTH_SHORT).show();
////            }
////        });
////    }
//
//
//    List<UserExAula5> infos;
//    UserListAdapterExAula5 userListAdapter;
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
////        infos = (List<UserExAula5>) getIntent().getExtras().getSerializable(Constants.EXTRA_FOR_B);
//        if (requestCode == Constants.EXTRA_FOR_AB && resultCode == RESULT_OK) {
//            if (infos == null) infos = new ArrayList<>();
//            infos = (List<UserExAula5>) data.getSerializableExtra(Constants.EXTRA_FOR_B);
//            userListAdapter = new UserListAdapterExAula5(this, infos);
//            listview.setAdapter(userListAdapter);
//        }
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_lista_exaula5);
//        ButterKnife.bind(this);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity_exaula5_teste_working_save.this,RegisterActivity.class);
//
////                ArrayList<String> selItemArray = new ArrayList<String>();
////                selItemArray=[infos.toString()];
////                Bundle bundle = new Bundle();
////                bundle.putStringArrayList("nomeCliente",selItemArray);
////
////                if (getIntent().getExtras() != null) {
////                    if (getIntent().getExtras().containsKey(Constants.EXTRA_FOR_B)) {
//////                title.setText(getIntent().getExtras().getString(Constants.EXTRA_FOR_B));
//////                user = (UserExAula5) getIntent().getExtras().getSerializable(Constants.EXTRA_FOR_B);
////                        infos = (List<UserExAula5>) getIntent().getExtras().getSerializable(Constants.EXTRA_FOR_B);
////                    }
////                }
//                if(infos ==null)infos=new ArrayList<>();
//                intent.putExtra(Constants.EXTRA_FOR_B, (Serializable) infos);
////                startActivityForResult(intent, 0);
//                startActivityForResult(intent,Constants.EXTRA_FOR_AB);
//            }
//        });
//
////
////        onActivityResult();
////
////        if(infos==null) {
////            infos = new ArrayList<>();
////        }
////        UserListAdapterExAula5 userListAdapter = new UserListAdapterExAula5(this, infos);
////        listview.setAdapter(userListAdapter);
////
////
////        if (getIntent().getExtras() != null) {
////            if (getIntent().getExtras().containsKey(Constants.EXTRA_FOR_B)) {
//////                title.setText(getIntent().getExtras().getString(Constants.EXTRA_FOR_B));
//////                user = (UserExAula5) getIntent().getExtras().getSerializable(Constants.EXTRA_FOR_B);
////                infos = (List<UserExAula5>) getIntent().getExtras().getSerializable(Constants.EXTRA_FOR_B);
////            }
////        }
////        if(user!=null) {
////            createUsers();
//////            userListAdapter.setNome((String.format("%s\n", user.getNome())));
//////            UserListAdapterExAula5.email.setText(String.format("%s\n",user.getEmail()));
////        }
////
//
//
//    }
//
//
////    private void createUsers() {
//////       if (infos.isEmpty()) {
////            UserExAula5 user1 = new UserExAula5();
////            user1.setNome(String.format("%s\n", user.getNome()));
////            user1.setEmail(String.format("%s\n", user.getEmail()));
////
//////            UserExAula5 user2 = new UserExAula5();
//////            user2.setId(2L);
//////            user2.setName("Maria");
//////            user2.setImage(R.drawable.ic_profile_noavatar);
//////            UserExAula5 user3 = new UserExAula5();
//////            user3.setId(2L);
//////            user3.setName("Jose");
//////            user3.setImage(R.drawable.ic_profile_noavatar);
////            infos.add(number,user1);
////            number+=1;
//////            infos.add(user2);
//////            infos.add(user3);
//////      }
//////    }
////    }
//}

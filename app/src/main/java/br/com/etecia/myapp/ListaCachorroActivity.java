package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class ListaCachorroActivity extends AppCompatActivity {

    //declarando a listview
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_cachorro_layout);

        listView = findViewById(R.id.idlistaCachorro);
        MyAdapter adapter = new MyAdapter();
        listView.setAdapter(adapter);



    }

    //criando a classe do adaptador, fora do OnCreate
    public class MyAdapter extends BaseAdapter
    {

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            return null;
        }
    }
}
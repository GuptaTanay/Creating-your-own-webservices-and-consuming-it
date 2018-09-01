package com.example.tanaygupta.saveandviewdataindbonserver;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.tanaygupta.saveandviewdataindbonserver.configs.URLNames;
import com.example.tanaygupta.saveandviewdataindbonserver.model.CategoryTO;
import com.example.tanaygupta.saveandviewdataindbonserver.utility.Validations;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class AddRecords extends AppCompatActivity {

    EditText et_name1, et_class1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_records);

        et_name1 = findViewById(R.id.et_name);
        et_class1 = findViewById(R.id.et_class);



    }

    public void save(View view)
    {
        String name= et_name1.getText().toString().trim();
        String class_name= et_name1.getText().toString().trim();
        String message="";
        if(Validations.isEmpty(name) || Validations.isEmpty(class_name))
        {
            message="Please Enter Valid details";
        }
        else
        {
            CategoryTO record= new CategoryTO();
            record.setName(name);
            record.setClass_name(class_name);
            new PostAddCategoryAsyncTask().execute(record);
        }
        Toast.makeText(AddRecords.this,message, Toast.LENGTH_LONG).show();

    }

    public String performInsertion(CategoryTO record){
        String result = "";
        try{
            String datastring = "name=" + record.getName();
            datastring += "&class=" + record.getClass_name();
            URL url = new URL(URLNames.ADD_URL);
            URLConnection con = url.openConnection();
            con.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(con.getOutputStream());
            wr.write( datastring );
            wr.flush();
            BufferedReader reader=new BufferedReader(new InputStreamReader(con.getInputStream()));
            String str ;
            while( ( str = reader.readLine()) != null){
                result += str;
            }
        }catch(Exception ex){
            result = ex.toString();
        }
        return result;
    }

    private  class PostAddCategoryAsyncTask extends AsyncTask<CategoryTO,Void , String >
    {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected String doInBackground(CategoryTO... categoryTOS) {
            return performInsertion(categoryTOS[0]);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            Toast.makeText(getApplicationContext(),s, Toast.LENGTH_LONG).show();

        }
    }
}

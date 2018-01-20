package com.example.akshay.retrofitpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        https://authorservice.com/author
//        method : post
//        body : {fnam:"",lname:""}


//        https://authorservice.com/book
//        method : get


//        https://authorservice.com/event
//        method : post
//        body : {fnam:"",lname:"}



        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://authorservice.com/")
                .build();

        AuthorJunctionService service = retrofit.create(AuthorJunctionService.class);

//        Call<List<Repo>> repos = service.listRepos("octocat");

//        Author mAuthor = new Author();
//        mAuthor.setFirstName("Dharmik");
//        mAuthor.setLastName("");


//        {"firstName":"dfd","lastName":""}

//        String s = "{\"firstName\":\"dfd\",\"lastName\":\"\"}";

//        JSONObject mObj = new JSONObject();
//        try {
//            mObj.put("firstName","dfd");
//            mObj.put("lastName","dfd");
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//
//        JSONArray jAr = new JSONArray();
//        jAr.put(mObj);


//        ArrayList<HashMap<String,String>>


//        HashMap<String,String> mhash = new HashMap<>();
//        mhash.put("firstName","dfd");
//        mhash.put("lastName","dfd");
//        {firsnam:dfd,landlfds :dfdf}
//
//        HashMap<Integer,Integer> mhashInt = new HashMap<>();
//        mhash.put("firstName",1);
//        mhash.put("lastName",2);


//        ArrayList<int> adr = new ArrayList<>();
//        adr.add(1);
//        adr.add(2);
//        [1,2];


//        [{"name":"dfd",address:"dfdf","mobilenumber":1234},
//         {"name":"dfd1",address:"dfdf","mobilenumber":1234}]

//        ArrayList<HashMap<String,String>> dfd = new ArrayList<>();
//
//        HashMap<String,String> mi = new HashMap<>();
//        mi.put("name","dfd");
//        mi.put("address","dfddfd");
//        mi.put("mobilenumber","1234566");
//
//        dfd.add(mi);
//
//
//        mi = new HashMap<>();
//        mi.put("name","dfd1");
//        mi.put("address","sdsd");
//        mi.put("mobilenumber","we33");
//
//        dfd.add(mi);
//
//
//
//        HashMap<String,String> mis = new HashMap<>();
//        mi.put("name","dfd");
//        mi.put("address","dfddfd");
//        mi.put("mobilenumber",123);
//
//        dfd.add(mi);



//        JSONObject ji = new JSONObject();
//        try {
//            ji.put("name","dfd");
//            ji.put("mobilenumber",123);
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }


        final ArrayList<Author>[] authorList = {new ArrayList<>()};


        Author mAuthor = new Author();
        mAuthor.setFirstName("Dharmik");
        mAuthor.setLastName("dfdsfsa");
        mAuthor.setMobileNumber(123);




//        service.createAuthor(mAuthor);

//        service.createAuthor(mAuthor).enqueue(new Callback<ResponseStatus>() {
//            @Override
//            public void onResponse(Call<ResponseStatus> call, Response<ResponseStatus> response) {
//                ResponseStatus responseStatus = response.body();
//                if(responseStatus.getStatus() == "1"){
//                    Toast.makeText(responseStatus.getMessage(),Toast.LENGTH_LONG).show();
//                }
//            }
//
//            @Override
//            public void onFailure(Call<ResponseStatus> call, Throwable t) {
//
//            }
//        });


        service.getAuthors().enqueue(new Callback<List<Author>>() {
            @Override
            public void onResponse(Call<List<Author>> call, Response<List<Author>> response) {
                List<Author> authorListm = response.body();

//                authorListm.get(0).getFirstName();

            }

            @Override
            public void onFailure(Call<List<Author>> call, Throwable t) {

            }
        });

    }

    public interface AuthorJunctionService {

        @GET("author")
        Call<List<Author>> getAuthors();

        @POST("author")
        Call<ResponseStatus> createAuthor(@Body Author mAuthor);

//        {"status":"1","message":"thai gyu bhai"}
//        {"status":"0","message":"na thayu bhai"}


//        @POST("author")
//        Call<Author> createAuthor(@Body Author user);

    }
}

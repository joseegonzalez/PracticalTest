package nyc.c4q.josegonzalez.practicaltest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.io.IOException;

import nyc.c4q.josegonzalez.practicaltest.Internet.VineService;
import nyc.c4q.josegonzalez.practicaltest.Model.Data;
import nyc.c4q.josegonzalez.practicaltest.Model.VineInfo;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class VineActivity extends AppCompatActivity {
    public static final String TAG = VineActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vine);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.vine.co/api/timelines/users/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        VineService service = retrofit.create(VineService.class);

        Call<VineInfo> call = service.getData();

        call.enqueue(new Callback<VineInfo>() {

            @Override
            public void onResponse(Call<VineInfo> call, Response<VineInfo> response) {
                try {
                    if(response.isSuccessful()) {
                        Log.d(TAG, "Success: " + response.body());
                        Log.d(TAG, "Size: " + Data.getSize());
                    } else {
                        Log.d(TAG, "Error" + response.errorBody().string());
                    }
                } catch(IOException e) {
                    Log.e(TAG, e.getMessage());
                }
            }

            @Override
            public void onFailure(Call<VineInfo> call, Throwable t) {
                // Something went completely wrong (like no internet connection)
                Log.d("Error", t.getMessage());
            }
        });
    }
}

package nyc.c4q.josegonzalez.practicaltest.Internet;

import nyc.c4q.josegonzalez.practicaltest.Model.VineInfo;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by mathcore on 12/10/16.
 */

public interface VineService {

    @GET("918753190470619136")
    Call<VineInfo> getData();
}

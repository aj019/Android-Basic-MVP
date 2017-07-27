package in.androidmate.notes_mvp.network;

import in.androidmate.notes_mvp.models.Books;
import in.androidmate.notes_mvp.models.Item;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by anujgupta on 27/07/17.
 */

public interface NetworkStore {
    @GET("volumes")
    Observable<Books> getTopBooks(@Query("q") String q);

    @GET("volumes/{id}")
    Observable<Item> getDetailBook(@Path("id") String id);
}


package in.androidmate.notes_mvp.models;

import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class ImageLinks {

    @SerializedName("smallThumbnail")
    private String mSmallThumbnail;
    @SerializedName("thumbnail")
    private String mThumbnail;

    public String getSmallThumbnail() {
        return mSmallThumbnail;
    }

    public void setSmallThumbnail(String smallThumbnail) {
        mSmallThumbnail = smallThumbnail;
    }

    public String getThumbnail() {
        return mThumbnail;
    }

    public void setThumbnail(String thumbnail) {
        mThumbnail = thumbnail;
    }

}

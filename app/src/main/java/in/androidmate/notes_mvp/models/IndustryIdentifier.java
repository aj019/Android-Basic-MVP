
package in.androidmate.notes_mvp.models;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class IndustryIdentifier {

    @SerializedName("identifier")
    private String mIdentifier;
    @SerializedName("type")
    private String mType;

    public String getIdentifier() {
        return mIdentifier;
    }

    public void setIdentifier(String identifier) {
        mIdentifier = identifier;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

}

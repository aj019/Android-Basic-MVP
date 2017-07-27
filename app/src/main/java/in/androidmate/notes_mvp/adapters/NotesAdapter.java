package in.androidmate.notes_mvp.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import in.androidmate.notes_mvp.R;

/**
 * Created by anujgupta on 27/07/17.
 */

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.Notes> {

    Context context;
    List<String> notes;

    public NotesAdapter(Context context, List<String> notes) {

        this.context = context;
        this.notes = notes;
    }

    @Override
    public Notes onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_notes,parent,false);
        Notes n = new Notes(v);
        return n;
    }

    @Override
    public void onBindViewHolder(Notes holder, int position) {

        holder.tvNote.setText(notes.get(position));

    }

    @Override
    public int getItemCount() {
        return notes.size();
    }

    public class Notes extends RecyclerView.ViewHolder {

        TextView tvNote;
        public Notes(View itemView) {
            super(itemView);

            tvNote = (TextView) itemView.findViewById(R.id.tvNote);
        }
    }
}

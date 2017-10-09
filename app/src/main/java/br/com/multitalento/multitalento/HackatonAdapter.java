package br.com.multitalento.multitalento;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.com.multitalento.multitalento.models.Hackaton;


/**
 * Created by logonrm on 12/09/2017.
 */

public class HackatonAdapter extends RecyclerView.Adapter<HackatonAdapter.HackatonViewHolder>{

    private Context context;
    private List<Hackaton> hackatons;

    public HackatonAdapter (Context context, List<Hackaton> hackatons){
        this.context = context;
        this.hackatons = hackatons;
    }

    @Override
    public HackatonAdapter.HackatonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(this.context).inflate(R.layout.recyclerview_hackatons, parent, false);
        HackatonViewHolder contatoViewHolder = new HackatonViewHolder(v);
        return contatoViewHolder;
    }

    @Override
    public void onBindViewHolder(HackatonAdapter.HackatonViewHolder holder, int position) {
        final Hackaton hackatons = this.hackatons.get(position);
        holder.txtNome.setText(hackatons.getName());
        holder.txtDes.setText(hackatons.getDes());
    }

    @Override
    public int getItemCount() {
        return this.hackatons.size();
    }

    public static class HackatonViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;
        ImageView imgHackaton;
        TextView txtNome;
        TextView txtDes;

        public HackatonViewHolder(View itemView) {
            super(itemView);

            cardView = (CardView) itemView;
            imgHackaton = (ImageView)itemView.findViewById(R.id.imgHackaton);
            txtNome = (TextView)itemView.findViewById(R.id.txtNome);
            txtDes = (TextView)itemView.findViewById(R.id.txtDes);
        }
    }
}

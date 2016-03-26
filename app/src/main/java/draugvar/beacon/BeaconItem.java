package draugvar.beacon;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.mikepenz.fastadapter.items.AbstractItem;

public class BeaconItem extends AbstractItem<BeaconItem, BeaconItem.ViewHolder> {
    public String name;
    public String distance;


    //The unique ID for this type of item
    @Override
    public int getType() {
        return R.id.beacon_item;
    }

    //The layout to be used for this type of item
    @Override
    public int getLayoutRes() {
        return R.layout.beacon_layout;
    }

    //The logic to bind your data to the view
    @Override
    public void bindView(ViewHolder viewHolder) {
        //call super so the selection is already handled for you
        super.bindView(viewHolder);

        //bind our data
        //set the text for the name
        viewHolder.name.setText(String.format("ID1: %s", name));
        //set the text for the distance or hide
        viewHolder.distance.setText(String.format("Distance: %s", distance));
        viewHolder.immagine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(v.getContext(), ClueActivity.class);
                v.getContext().startActivity(i);
            }
        });
    }



    //The viewHolder used for this item. This viewHolder is always reused by the RecyclerView so scrolling is blazing fast
    protected static class ViewHolder extends RecyclerView.ViewHolder {
        protected TextView name;
        protected TextView distance;
        protected ImageView immagine;

        public ViewHolder(View view) {
            super(view);
            this.name = (TextView) view.findViewById(R.id.id1);
            this.distance = (TextView) view.findViewById(R.id.distance);
            this.immagine=(ImageView)view.findViewById(R.id.immagine);
        }
    }
}
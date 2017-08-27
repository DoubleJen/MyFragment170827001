package tw.adouble.app.helloworld.myfragment170827001;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class F2Fragment extends Fragment {
    private View view;
    private TextView f2mesg;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if(view == null){
            view = inflater.inflate(R.layout.fragment_f2, container, false);
            f2mesg = (TextView)view.findViewById(R.id.f2mesg);
        }
        return view;
    }

    public TextView getF2mesg(){
        return f2mesg;
    }
}

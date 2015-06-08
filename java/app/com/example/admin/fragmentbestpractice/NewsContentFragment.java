package app.com.example.admin.fragmentbestpractice;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by admin on 2015/6/3.
 */
public class NewsContentFragment extends Fragment {
    View view;
    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        view = inflater.from(getActivity()).inflate(R.layout.news_content_frag,null);
        return view;
    }

    public void refresh(String title, String content){
        String newsTitle = title;
        String newsContent = content;
        TextView t = (TextView)view.findViewById(R.id.content_title_frag);
        TextView c = (TextView)view.findViewById(R.id.content_detail_frag);
        if (newsTitle.length() != 0){
            t.setText(newsTitle);
            if (newsContent.length() != 0){
                c.setText(newsContent);
            }
        }
    }

}
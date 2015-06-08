package app.com.example.admin.fragmentbestpractice;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;


public class NewsContentActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_content);
    }

    public void actionStart(Context context, News news){
        Intent intent = new Intent(context,NewsContentActivity.class );
        intent.putExtra("parm",news);

    }



}

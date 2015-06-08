package app.com.example.admin.fragmentbestpractice;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2015/6/1.
 */
public class NewsListFragment extends Fragment {

    List<News> newsList = new ArrayList<News>();
    List<String> newsTitleList = new ArrayList<String>();

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.from(getActivity()).inflate(R.layout.news_list_frag,null);
        addNews();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),R.layout.news_title_item,newsTitleList);
        ListView list = (ListView)view.findViewById(R.id.news_listview);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new NewsClick());
        return view;
    }

    public void addNews(){
        News news = new News();
        news.setTitle("Police kill Massachusetts man, arrest another in anti-terror investigation");
        news.setContent("AUTHORITIES IN Massachusetts arrested a man in connection with a counterterror investigation, hours after another man under surveillance by the Joint Terrorism Task Force was shot and killed after he refused to put down a military-style knife while approaching two officers.");
        newsList.add(news);
        newsTitleList.add(news.getTitle());

        news.setTitle("ISIS' frightening arsenal: Remote-controlled sniper rifles, steel plated suicide trucks");
        news.setContent("KIRKUK, Iraq –  Captured ISIS weapons show the black-clad militants are developing an arsenal of sophisticated arms, and Kurdish fighters told FoxNews.com they fear the terrorist force's expanding manufacturing capability is making it more formidable by the day.\n" +
                "\n" +
                "In a dusty outpost near the Kurdish-held northern city of Kirkuk, a Peshmerga commander recently displayed two weapons that show his enemy's increasing adaptability on the battlefield. One was a scoped sniper rifle, customized and mounted on a welded steel platform and built to track targets by computer and fire by remote control. The other was a much different type of weapon - a truck reinforced with two-inch thick steel plates to ensure its load of explosives could crash through checkpoints and make it to its target before detonating.");
        newsList.add(news);
        newsTitleList.add(news.getTitle());

        news.setTitle("New photos of Kim Jong Un show dictator's weight gain, raise health concerns");
        news.setContent("New photos of North Korean dictator Kim Jong Un published earlier this week show that he has put on weight, raising concerns about the possibility of a move to oust him from power should his health take a turn for the worse. \n" +
                "\n" +
                "The images, which first appeared Monday in North Korea's official Rodong Sinmun newspaper and were published by the Korean Central News Agency, show Kim touring a state farm accompanied by military officials");
        newsList.add(news);
        newsTitleList.add(news.getTitle());

        news.setTitle("Blatter 'under investigation in US'");
        news.setContent("The news came hours after Mr Blatter, 79, announced that he was stepping down from his role.\n" +
                "US prosecutors launched a criminal inquiry last week, with seven Fifa officials arrested in Switzerland, part of a group of 14 people indicted.\n" +
                "Two days after the arrests, Mr Blatter was re-elected president of Fifa.\n" +
                "However, he said on Tuesday that it appeared the mandate he had been given \"does not seem to be supported by everyone in the world\".\n" +
                "Mr Blatter said: \"Fifa needs profound restructuring.\" He said he would continue in post until an extraordinary congress is called to elect a new president.\n" +
                "No dates have been set, but it is expected to take place between December 2015 and March 2016.");
        newsList.add(news);
        newsTitleList.add(news.getTitle());

        news.setTitle("Federal officials voiced growing alarm over Clinton’s compliance ");
        news.setContent("Over a five-year span, senior officials at the National Archives and Records Administrations (NARA) voiced growing alarm about Hillary Clinton’s record-keeping practices as secretary of state, according to internal documents shared with Fox News.\n" +
                "\n" +
                "During Clinton’s final days in office, Paul Wester, the director of Modern Records Programs at NARA – essentially the agency’s chief records custodian – privately emailed five NARA colleagues to confide his fear that Clinton would take her official records with her when she left office, in violation of federal statutes.\n" +
                "\n" +
                "Referring to a colleague whose full name is unknown, Wester wrote on December 11, 2012: “Tom heard (or thought he heard) from the Clinton Library Director that there are or may be plans afoot for taking her records from State to Little Rock.\" That was a reference to the possibility that Clinton might seek to house her records at the Clinton Presidential Center, which was largely funded by the Clinton Foundation.");
        newsList.add(news);
        newsTitleList.add(news.getTitle());

        news.setTitle("China ship capsize: Hopes fade of finding Yangtze survivors");
        news.setContent("Hopes are fading of any more survivors being found inside a cruise ship which capsized on China's Yangtze River.\n" +
                "The Eastern Star, with 456 mostly elderly people on board, overturned in bad weather on Monday night.\n" +
                "Eighteen people are now confirmed to have died, state media says, and 14 have been rescued - some had been trapped in air pockets inside the hull.\n" +
                "Officials say they will keep looking for survivors, but it could be China's worst boat disaster in decades.\n" +
                "\"As long as there's even a little hope, we will give it 100% and will absolutely not give up,\" Transport Minister Yang Chuantang said, before adding that rescuers were in \"a race against time\".\n" +
                "Premier Li Keqiang urged divers to keep searching the ship in an \"overnight battle\" to find more survivors after at least two remarkable rescues on Tuesday, including one of a 65-year-old woman.");
        newsList.add(news);
        newsTitleList.add(news.getTitle());

        news.setTitle("Obama signs bill to resume, overhaul NSA surveillance");
        news.setContent("President Obama Tuesday night signed legislation that passed Congress only hours earlier, restarting -- but also overhauling -- controversial government surveillance programs that went dark over the weekend after lawmakers missed a key deadline. \n" +
                "\n" +
                "The White House confirmed in a statement that Obama signed the measure Tuesday night. Obama previously said he would sign the bill as soon as it reached his desk.\n" +
                "\n" +
                "\"After a needless delay and inexcusable lapse in important national security authorities, my Administration will work expeditiously to ensure our national security professionals again have the full set of vital tools they need to continue protecting the country,\" Obama said.\n" +
                "\n" +
                "In a 67-32 vote, the Senate approved the so-called USA Freedom Act. The legislation had already won approval in the House. \n" +
                "\n" +
                "The vote came after key surveillance programs -- most notably, the National Security Agency's bulk collection of Americans' phone records -- were suspended Sunday after Congress missed the deadline for reauthorization. \n" +
                "\n" +
                "The passage of the USA Freedom Act means several changes are in store, particularly for that NSA program. Obama and a cross-section of Republican and Democratic lawmakers supported the legislation.");
        newsList.add(news);
        newsTitleList.add(news.getTitle());

    }

    class NewsClick implements AdapterView.OnItemClickListener {

        public void onItemClick(AdapterView<?> parent, View view, int position, long id){
            int p = position;
            String newsTitle;
            String newsDetail;
            newsTitle = newsList.get(p).getTitle();
            newsDetail=newsList.get(p).getContent();

        }

    }

}

package com.dev.lawrence.licenta_poo;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.transition.Slide;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Lawrence on 18-Mar-18.
 */

public class SlideAdapter extends PagerAdapter{

    Context context;
    LayoutInflater inflater;

    //lista de imagini pentru LearnMenu
    public int[]  lista_imagini = {
            R.drawable.csharp_logo,
            R.drawable.cpp_logo,
            R.drawable.java_logo
    };

    //lista de titluri pentru LearnMenu
    public String[] lista_titluri = {
            "Learn C#",
            "Learn C++",
            "Learn Java"
    };

    //lista de scurta descriere pentru LearnMenu
    public String[] lista_sDescriere = {
            "C# is an elegant and type-safe object-oriented language that enables developers to build a variety of secure and robust applications that run on the .NET Framework",
            "C++ is a general-purpose object-oriented programming (OOP) language, developed by Bjarne Stroustrup, and is an extension of the C language.",
            "Java is a general purpose, high-level programming language developed by Sun Microsystems."
    };

    //lista culori background pentru LearnMenu
    public int[] lista_culoriBackg = {
            Color.rgb(26, 101, 22),
            Color.rgb(162, 26, 221),
            Color.rgb(221, 26, 133)
    };

    public SlideAdapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return lista_titluri.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view== (LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.learning_menu,container,false);
        LinearLayout layoutSlide = (LinearLayout) view.findViewById(R.id.slideLinearLayout);
        ImageView imgSlide = (ImageView) view.findViewById(R.id.learnImg_slideMenu);
        TextView txtViewTitle = (TextView) view.findViewById(R.id.learnTitle_slideMenu);
        TextView txtViewSD = (TextView) view.findViewById(R.id.learnSD_slideMenu);

        layoutSlide.setBackgroundColor(lista_culoriBackg[position]);
        imgSlide.setImageResource(lista_imagini[position]);
        txtViewTitle.setText(lista_titluri[position]);
        txtViewSD.setText(lista_sDescriere[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }


}

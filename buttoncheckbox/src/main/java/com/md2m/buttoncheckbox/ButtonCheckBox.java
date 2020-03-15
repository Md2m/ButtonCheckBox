package com.md2m.buttoncheckbox;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;

@SuppressLint("AppCompatCustomView")
public class ButtonCheckBox extends CheckBox {


    int checkedColor;
    int uncheckColor;
    float topLRadius , topRRadius , bottomLRadius , bottomRRadius;
    int checkedTextColor , uncheckTextColor;
    String checkedText , uncheckText;
    Boolean anim;


    public ButtonCheckBox(Context context, AttributeSet attrs) {
        super(context, attrs);
        setupAttributes(attrs);
        setButtonDrawable(null);
        setBackgroundDrawable(cornerRadius(uncheckColor,topLRadius,topRRadius,bottomLRadius,bottomRRadius));
        setTextColor(uncheckTextColor);
        setText(uncheckText);


    }

    private void setupAttributes(AttributeSet attrs) {


        TypedArray a = getContext().getTheme().obtainStyledAttributes(attrs, R.styleable.ButtonCheckBox, 0, 0);

        try {

            checkedColor = a.getColor(R.styleable.ButtonCheckBox_checkedColor, Color.BLUE);
            uncheckColor = a.getColor(R.styleable.ButtonCheckBox_uncheckColor, Color.RED);
            topLRadius = a.getFloat(R.styleable.ButtonCheckBox_topLeftRadius,0);
            topRRadius = a.getFloat(R.styleable.ButtonCheckBox_topRightRadius,0);
            bottomLRadius = a.getFloat(R.styleable.ButtonCheckBox_bottomLeftRadius,0);
            bottomRRadius = a.getFloat(R.styleable.ButtonCheckBox_bottomRightRadius,0);
            checkedTextColor = a.getColor(R.styleable.ButtonCheckBox_checkedTextColor,Color.BLACK);
            uncheckTextColor = a.getColor(R.styleable.ButtonCheckBox_uncheckTextColor,Color.BLACK);
            checkedText = a.getString(R.styleable.ButtonCheckBox_checkedText);
            uncheckText = a.getString(R.styleable.ButtonCheckBox_uncheckText);

        } finally {

            a.recycle();
        }

    }

    public Drawable cornerRadius(int bgColor, float topLeftRadius , float topRightRadius , float bottomLeftRadius , float bottomRightRadius){

        GradientDrawable shape = new GradientDrawable();

        float [] values = {topLeftRadius , topLeftRadius , topRightRadius , topRightRadius , bottomRightRadius , bottomRightRadius , bottomLeftRadius , bottomRightRadius };
        shape.setColor(bgColor);
        shape.setCornerRadii(values);

        return shape;
    }


    public void enableAnimation(boolean enableAnimation){
        anim = enableAnimation;
    }

    @Override
    public void setChecked(boolean checked) {
        super.setChecked(checked);

        if (checked){

            this.setBackgroundDrawable(cornerRadius(checkedColor,topLRadius,topRRadius,bottomLRadius,bottomRRadius));
            this.setTextColor(checkedTextColor);
            this.setText(checkedText);

            if (anim){

                this.startAnimation(AnimationUtils.loadAnimation(getContext(),R.anim.shake));

            }


        }else {


            this.setBackgroundDrawable(cornerRadius(uncheckColor,topLRadius,topRRadius,bottomLRadius,bottomRRadius));
            this.setTextColor(uncheckTextColor);
            this.setText(uncheckText);

        }


    }

}

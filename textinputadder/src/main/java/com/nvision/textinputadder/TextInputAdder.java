package com.nvision.textinputadder;

import android.content.Context;
import android.widget.TextView;

public class TextInputAdder {
    public TextView addTextView(Context context, String text) {
        TextView textView = new TextView(context);
        textView.setText(text);
        return textView;
    }
}

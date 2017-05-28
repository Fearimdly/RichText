package com.zzhoujay.richtext.parser;

import android.content.Context;
import android.text.Spanned;
import android.widget.TextView;

import com.zzhoujay.markdown.MarkDown;

/**
 * Created by zhou on 16-7-27.
 * Markdown2SpannedParser
 */
public class Markdown2SpannedParser implements SpannedParser {

    private Context mContext;

    public Markdown2SpannedParser(Context context) {
        mContext = context;
    }

    @Override
    public Spanned parse(String source) {
        return MarkDown.fromMarkdown(source, null, mContext);
    }
}

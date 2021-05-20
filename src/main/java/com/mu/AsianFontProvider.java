package com.mu;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.tool.xml.XMLWorkerFontProvider;

import java.io.IOException;

/**
 * 字体类
 */
public class AsianFontProvider extends XMLWorkerFontProvider {

    @Override
    public Font getFont(final String fontname, final String encoding,
                        final boolean embedded, final float size, final int style,
                        final BaseColor color) {
        try {
            BaseFont bf = BaseFont.createFont("STSongStd-Light", "UniGB-UCS2-H",
                    BaseFont.NOT_EMBEDDED);
            Font font = new Font(bf, size, style, color);
            font.setColor(color);
            return font;
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return super.getFont(fontname, encoding, embedded, size, style, color);
    }
}



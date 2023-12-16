package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.0M2  reason: invalid class name */
public class AnonymousClass0M2 {
    public int A00 = -1;
    public int A01;
    public AnonymousClass0XZ A02;
    public ArrayList A03 = AnonymousClass001.A0s();

    public AnonymousClass0M2(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), AnonymousClass0K9.A06);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.A01 = obtainStyledAttributes.getResourceId(index, this.A01);
            } else if (index == 1) {
                this.A00 = obtainStyledAttributes.getResourceId(index, this.A00);
                String resourceTypeName = context.getResources().getResourceTypeName(this.A00);
                context.getResources().getResourceName(this.A00);
                if ("layout".equals(resourceTypeName)) {
                    AnonymousClass0XZ r3 = new AnonymousClass0XZ();
                    this.A02 = r3;
                    r3.A0B((ConstraintLayout) LayoutInflater.from(context).inflate(this.A00, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }
}

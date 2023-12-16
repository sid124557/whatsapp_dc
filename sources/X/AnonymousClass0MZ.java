package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.0MZ  reason: invalid class name */
public class AnonymousClass0MZ {
    public float A00 = Float.NaN;
    public float A01 = Float.NaN;
    public float A02 = Float.NaN;
    public float A03 = Float.NaN;
    public int A04 = -1;
    public AnonymousClass0XZ A05;

    public AnonymousClass0MZ(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), AnonymousClass0K9.A08);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.A04 = obtainStyledAttributes.getResourceId(index, this.A04);
                String resourceTypeName = context.getResources().getResourceTypeName(this.A04);
                context.getResources().getResourceName(this.A04);
                if ("layout".equals(resourceTypeName)) {
                    AnonymousClass0XZ r6 = new AnonymousClass0XZ();
                    this.A05 = r6;
                    r6.A0B((ConstraintLayout) LayoutInflater.from(context).inflate(this.A04, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.A00 = obtainStyledAttributes.getDimension(index, this.A00);
            } else if (index == 2) {
                this.A02 = obtainStyledAttributes.getDimension(index, this.A02);
            } else if (index == 3) {
                this.A01 = obtainStyledAttributes.getDimension(index, this.A01);
            } else if (index == 4) {
                this.A03 = obtainStyledAttributes.getDimension(index, this.A03);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}

package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;

/* renamed from: X.5P9  reason: invalid class name */
public class AnonymousClass5P9 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public Rect A08;
    public Uri A09;
    public Uri A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public boolean A0E = true;
    public boolean A0F = true;
    public boolean A0G;
    public boolean A0H = false;
    public boolean A0I = true;
    public final Context A0J;

    public Intent A00() {
        Context context = this.A0J;
        Uri uri = this.A09;
        Uri uri2 = this.A0A;
        String str = this.A0C;
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A06;
        int i4 = this.A07;
        int i5 = this.A04;
        int i6 = this.A03;
        Rect rect = this.A08;
        boolean z = this.A0E;
        boolean z2 = this.A0I;
        boolean z3 = this.A0F;
        int i7 = this.A05;
        boolean z4 = this.A0G;
        String str2 = this.A0D;
        String str3 = this.A0B;
        int i8 = this.A02;
        boolean z5 = this.A0H;
        Intent A072 = C18320x8.A07();
        A072.setClassName(context.getPackageName(), "com.whatsapp.crop.CropImage");
        A072.setData(uri);
        A072.putExtra("output", uri2);
        A072.putExtra("outputFormat", str);
        A072.putExtra("circleCrop", (String) null);
        A072.putExtra("aspectX", i);
        A072.putExtra("aspectY", i2);
        A072.putExtra("outputX", i3);
        A072.putExtra("outputY", i4);
        A072.putExtra("minCrop", i5);
        A072.putExtra("maxCrop", i6);
        A072.putExtra("initialRect", rect);
        A072.putExtra("cropByOutputSize", z);
        A072.putExtra("scale", true);
        A072.putExtra("scaleUpIfNeeded", z2);
        A072.putExtra("maxFileSize", 0);
        A072.putExtra("flattenRotation", z3);
        A072.putExtra("rotation", i7);
        A072.putExtra("flipH", z4);
        A072.putExtra("flipV", false);
        A072.putExtra("webImageSource", str2);
        A072.putExtra("doodle", str3);
        A072.putExtra("filter", i8);
        A072.putExtra("rotateAspect", z5);
        return A072;
    }

    public AnonymousClass5P9(Context context) {
        this.A0J = context;
    }
}

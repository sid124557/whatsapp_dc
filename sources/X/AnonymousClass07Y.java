package X;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.07Y  reason: invalid class name */
public abstract class AnonymousClass07Y extends AnonymousClass034 {
    public int A00;
    public int A01;
    public LayoutInflater A02;

    @Deprecated
    public AnonymousClass07Y(Context context, int i) {
        super(context, (Cursor) null, true);
        this.A00 = i;
        this.A01 = i;
        this.A02 = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public View A02(Context context, Cursor cursor, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(this.A02, viewGroup, this.A00);
    }

    public View A03(Context context, Cursor cursor, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(this.A02, viewGroup, this.A01);
    }
}

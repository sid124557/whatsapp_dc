package X;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.List;

/* renamed from: X.0Mh  reason: invalid class name and case insensitive filesystem */
public class C03980Mh {
    public Context A00;
    public C04320Nt A01;
    public C03790Lo A02 = new C03790Lo();
    public WorkDatabase A03;
    public C15380rF A04;
    public C06250Wv A05;
    public C16180sb A06;
    public List A07;
    public final List A08;

    public C03980Mh(Context context, C04320Nt r3, WorkDatabase workDatabase, C15380rF r5, C06250Wv r6, C16180sb r7, List list) {
        this.A00 = context.getApplicationContext();
        this.A06 = r7;
        this.A04 = r5;
        this.A01 = r3;
        this.A03 = workDatabase;
        this.A05 = r6;
        this.A08 = list;
    }
}

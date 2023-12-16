package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.gallerypicker.PhotoViewPager;
import java.util.HashSet;

/* renamed from: X.5nZ  reason: invalid class name and case insensitive filesystem */
public class C114765nZ implements C182638ok {
    public float A00;
    public float A01;
    public C87984Ww A02;
    public C182638ok A03;
    public C179438j9 A04;
    public final Context A05;
    public final RecyclerView A06;
    public final C620733j A07;
    public final PhotoViewPager A08;
    public final AnonymousClass5LQ A09;

    public C114765nZ(RecyclerView recyclerView, C33131sU r21, C620733j r22, C133846i2 r23, AnonymousClass5Y0 r24, AnonymousClass1VX r25, C106105Xq r26, C53492nB r27, PhotoViewPager photoViewPager, C988953q r29, C105385Us r30, AnonymousClass5LQ r31, AnonymousClass33O r32, C989053r r33, HashSet hashSet) {
        RecyclerView recyclerView2 = recyclerView;
        this.A06 = recyclerView2;
        this.A08 = photoViewPager;
        AnonymousClass5LQ r13 = r31;
        this.A09 = r13;
        C620733j r5 = r22;
        this.A07 = r5;
        Context context = recyclerView2.getContext();
        this.A05 = context;
        C33131sU r4 = r21;
        C989053r r16 = r33;
        C133846i2 r6 = r23;
        AnonymousClass5Y0 r7 = r24;
        AnonymousClass1VX r8 = r25;
        C106105Xq r9 = r26;
        C53492nB r10 = r27;
        C988953q r11 = r29;
        C105385Us r12 = r30;
        this.A02 = new C87984Ww(context, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, this, r32, r16, hashSet, C18320x8.A00(context, R.dimen.f6nameremoved));
        recyclerView2.setItemAnimator((AnonymousClass0UY) null);
        recyclerView2.A0h = true;
    }

    public void Be3(int i) {
        C182638ok r0 = this.A03;
        if (r0 != null) {
            r0.Be3(i);
        }
    }
}

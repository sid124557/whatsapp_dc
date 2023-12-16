package X;

import android.net.Uri;
import com.whatsapp.community.iq.CreateCommunityManager$$ExternalSyntheticLambda0;
import com.whatsapp.util.Log;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2xY  reason: invalid class name and case insensitive filesystem */
public class C59822xY {
    public long A00;
    public C84394Ce A01;
    public C27991fJ A02;
    public final C17280vG A03;
    public final C55682qk A04;
    public final C69263Wi A05;
    public final C56972sr A06;
    public final C64773Ex A07;
    public final C56332ro A08;
    public final C56612sH A09;
    public final AnonymousClass1VX A0A;
    public final C66493Lq A0B;
    public final C29331ie A0C;
    public final AnonymousClass2YG A0D;
    public final AnonymousClass31C A0E;
    public final C30191m3 A0F;
    public final C54182oJ A0G;
    public final Map A0H = AnonymousClass0x7.A0y();
    public final AtomicInteger A0I;

    public static /* synthetic */ void A00(C59822xY r5, int i) {
        if (i == 0) {
            r5.A0G.A00(11, r5.A09.A0H() - r5.A00);
            if (!r5.A0H.isEmpty() && r5.A02 != null) {
                C69263Wi.A03(r5.A05, r5, 25);
            }
        }
    }

    public void A01(Uri uri, String str, String str2, Set set, Set set2, boolean z) {
        AnonymousClass1VX r5 = this.A0A;
        if (r5.A0Y(C58422vE.A02, 5543)) {
            Log.e("Community creation disabled");
            return;
        }
        C56612sH r4 = this.A09;
        this.A00 = r4.A0H();
        C66493Lq r6 = this.A0B;
        C28001fK A052 = r6.A05();
        C55682qk r2 = this.A04;
        C56972sr r3 = this.A06;
        AnonymousClass31C r9 = this.A0E;
        AnonymousClass3P1 r7 = new AnonymousClass3P1(uri, this, set, set2);
        C47492dL r1 = new C47492dL(A052);
        r1.A03 = str;
        r1.A02 = str2;
        r1.A04 = AnonymousClass001.A0s();
        r1.A0A = true;
        r1.A0B = z;
        new AnonymousClass3TR(r2, r3, r4, r5, r6, r7, r1.A00(), r9).A00();
    }

    public C59822xY(C15910sA r4, C55682qk r5, C69263Wi r6, C56972sr r7, C84394Ce r8, C64773Ex r9, C56332ro r10, C56612sH r11, AnonymousClass1VX r12, C66493Lq r13, C29331ie r14, AnonymousClass2YG r15, AnonymousClass31C r16, C30191m3 r17, C54182oJ r18) {
        this.A09 = r11;
        this.A0A = r12;
        this.A05 = r6;
        this.A04 = r5;
        this.A06 = r7;
        this.A0E = r16;
        this.A07 = r9;
        this.A0B = r13;
        this.A08 = r10;
        this.A0F = r17;
        this.A0G = r18;
        this.A0C = r14;
        this.A0D = r15;
        this.A01 = r8;
        boolean z = false;
        this.A0I = new AtomicInteger(0);
        C626936e.A01();
        C626936e.A0C(((AnonymousClass08A) r4.getLifecycle()).A02 != AnonymousClass0GC.DESTROYED ? true : z);
        CreateCommunityManager$$ExternalSyntheticLambda0 createCommunityManager$$ExternalSyntheticLambda0 = new CreateCommunityManager$$ExternalSyntheticLambda0(this);
        this.A03 = createCommunityManager$$ExternalSyntheticLambda0;
        r4.getLifecycle().A00(createCommunityManager$$ExternalSyntheticLambda0);
    }
}

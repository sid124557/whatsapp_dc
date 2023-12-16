package X;

import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: X.5po  reason: invalid class name and case insensitive filesystem */
public class C116145po implements C179708ja {
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public float A02 = 0.0f;
    public int A03 = R.drawable.input_send;
    public long A04;
    public AnonymousClass7VK A05;
    public C179718jb A06 = null;
    public String A07;
    public List A08 = Collections.singletonList(C135166kE.A00);
    public boolean A09;
    public boolean A0A = false;
    public boolean A0B = false;
    public final C06270Wx A0C;
    public final C89654ea A0D;
    public final C56612sH A0E;
    public final C54292oU A0F;
    public final C620733j A0G;
    public final AnonymousClass1VX A0H;
    public final AnonymousClass5Oa A0I;
    public final C55612qd A0J;
    public final C113995mK A0K;
    public final C185948uV A0L;
    public final boolean A0M;

    public final void A00() {
        if (this.A05.A00 == AnonymousClass58Q.RECORDING) {
            this.A05 = new C985752a(this);
            this.A09 = false;
            C185948uV r3 = this.A0L;
            CreationModeBottomBar creationModeBottomBar = (CreationModeBottomBar) r3;
            C106755a7.A02(creationModeBottomBar.A04, creationModeBottomBar.A0B);
            creationModeBottomBar.A01();
            AnonymousClass67L.A00(C86664Kz.A0O(), creationModeBottomBar, 27);
            r3.BFf();
        }
    }

    public void A01(Intent intent) {
        Objects.requireNonNull(intent);
        this.A08 = C86634Kw.A12(intent, C95814uZ.class, "jids");
        C06270Wx r4 = this.A0C;
        boolean z = false;
        if (r4.A07() != null) {
            this.A0I.A00((C108845de) r4.A07(), this.A08, false);
        }
        int size = this.A08.size();
        int i = R.drawable.ic_done;
        if (size > 0) {
            z = true;
            i = R.drawable.input_send;
        }
        this.A03 = i;
        C54292oU r0 = this.A0F;
        int i2 = R.string.f11nameremoved;
        if (z) {
            i2 = R.string.f11nameremoved;
        }
        this.A07 = C54292oU.A00(r0).getString(i2);
        this.A05.A00();
    }

    public C116145po(C06270Wx r9, C89654ea r10, C56612sH r11, C54292oU r12, C620733j r13, AnonymousClass1VX r14, C55612qd r15, C113995mK r16, C185948uV r17) {
        AnonymousClass7VK r0;
        this.A0E = r11;
        this.A0H = r14;
        this.A0F = r12;
        this.A0G = r13;
        this.A0K = r16;
        this.A0J = r15;
        this.A0D = r10;
        boolean A0Y = r14.A0Y(C58422vE.A01, 1874);
        this.A0M = A0Y;
        this.A07 = C54292oU.A00(r12).getString(R.string.f11nameremoved);
        this.A0C = r9;
        C185948uV r7 = r17;
        this.A0L = r7;
        CreationModeBottomBar creationModeBottomBar = (CreationModeBottomBar) r7;
        AnonymousClass5Oa A002 = creationModeBottomBar.A08.A00(creationModeBottomBar.A0D);
        this.A0I = A002;
        r7.setNewRecipientsVisibility(true);
        if (A0Y) {
            r0 = new C985752a(this);
        } else {
            r0 = new AnonymousClass52W(this);
        }
        this.A05 = r0;
        this.A09 = false;
        creationModeBottomBar.A0E = this;
        r0.A00();
        List list = this.A08;
        C108845de r02 = (C108845de) r9.A07();
        Objects.requireNonNull(r02);
        A002.A00(r02, list, true);
    }
}

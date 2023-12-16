package X;

import com.whatsapp.comments.CommentListManager$loadMessages$1;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2yN  reason: invalid class name and case insensitive filesystem */
public final class C60332yN {
    public static final Comparator A0D = new AnonymousClass4IU(3);
    public final C86164Jb A00;
    public final C61142zm A01;
    public final C29431io A02;
    public final C72303dV A03;
    public final C624134x A04;
    public final C55832qz A05;
    public final AtomicReference A06 = new AtomicReference(AnonymousClass21B.UNINITIALIZED);
    public final C73853gB A07;
    public final AnonymousClass4C6 A08;
    public final C85504Gn A09;
    public final AnonymousClass4C8 A0A;
    public final C85524Gp A0B;
    public final C85564Gt A0C;

    public C60332yN(C61142zm r6, C29431io r7, C72303dV r8, C624134x r9, C55832qz r10, C73853gB r11, AnonymousClass4C6 r12) {
        C162457s7.A0J(r10, 1);
        C18260x0.A0a(r7, r6, r8, 2);
        C162457s7.A0J(r12, 7);
        this.A05 = r10;
        this.A02 = r7;
        this.A01 = r6;
        this.A03 = r8;
        this.A07 = r11;
        this.A04 = r9;
        this.A08 = r12;
        C832246p r0 = new C832246p(new TreeSet(A0D));
        this.A0B = r0;
        this.A0C = r0;
        C175748Zo r02 = new C175748Zo(C369720l.DROP_OLDEST, 1);
        this.A09 = r02;
        this.A0A = C154567dN.A01(r02);
        C86164Jb r03 = new C86164Jb(this, 2);
        this.A00 = r03;
        r7.A06(r03);
        this.A06.set(AnonymousClass21B.LOADING);
        C616131n.A02(this.A07, new CommentListManager$loadMessages$1(this, (C84814Du) null), this.A08, (AnonymousClass20D) null, 2);
    }

    public final boolean A00(C624134x r3) {
        Long A032;
        C55162pu A0t = r3.A0t();
        if (A0t == null || (A032 = A0t.A03()) == null) {
            return false;
        }
        return A032.equals(C624134x.A0A(this.A04));
    }
}

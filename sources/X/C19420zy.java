package X;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.ViewGroup;
import com.whatsapp.expressionstray.avatars.AvatarExpressionsFragment;
import com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment;
import com.whatsapp.expressionstray.gifs.GifExpressionsFragment;
import java.util.List;

/* renamed from: X.0zy  reason: invalid class name and case insensitive filesystem */
public final class C19420zy extends AnonymousClass0AY {
    public int A00;
    public SparseArray A01 = new SparseArray();
    public C41552Kr A02;
    public C632338l A03;
    public List A04 = C72023d3.A00;
    public boolean A05;
    public final C08270df A06;
    public final boolean A07;

    public C19420zy(C08270df r2, int i, boolean z, boolean z2) {
        super(r2, 0);
        this.A06 = r2;
        this.A07 = z;
        this.A00 = i;
        this.A05 = z2;
    }

    public void A09(ViewGroup viewGroup) {
        C162457s7.A0J(viewGroup, 0);
        super.A09(viewGroup);
    }

    public Object A0D(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        Object A0D = super.A0D(viewGroup, i);
        C162457s7.A0K(A0D, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        this.A01.put(i, A0D);
        return A0D;
    }

    public int A02(Object obj) {
        return -2;
    }

    public int A0C() {
        return this.A04.size();
    }

    public C08310eF A0G(int i) {
        boolean A0P;
        C08310eF avatarExpressionsFragment;
        Object obj = this.A04.get(i);
        if (C162457s7.A0P(obj, AnonymousClass1TZ.A00)) {
            EmojiExpressionsFragment emojiExpressionsFragment = new EmojiExpressionsFragment();
            Bundle A08 = AnonymousClass002.A08();
            A08.putBoolean("isCollapsed", this.A05);
            emojiExpressionsFragment.A0u(A08);
            return emojiExpressionsFragment;
        }
        AnonymousClass1Ta r1 = AnonymousClass1Ta.A00;
        if (C162457s7.A0P(obj, r1)) {
            A0P = C162457s7.A0P(this.A02, r1);
            avatarExpressionsFragment = new GifExpressionsFragment();
        } else {
            AnonymousClass1TY r12 = AnonymousClass1TY.A00;
            if (C162457s7.A0P(obj, r12)) {
                A0P = C162457s7.A0P(this.A02, r12);
                avatarExpressionsFragment = new AvatarExpressionsFragment();
            } else if (C162457s7.A0P(obj, AnonymousClass1Tb.A00)) {
                return AnonymousClass26Y.A00(this.A03, this.A00, this.A07, this.A05);
            } else {
                throw C73153f1.A00();
            }
        }
        Bundle A082 = AnonymousClass002.A08();
        A082.putBoolean("isExpressionsSearch", this.A07);
        A082.putBoolean("isCollapsed", this.A05);
        A082.putBoolean("isSelected", A0P);
        avatarExpressionsFragment.A0u(A082);
        return avatarExpressionsFragment;
    }

    public void A0E(ViewGroup viewGroup, Object obj, int i) {
        C18260x0.A0P(viewGroup, obj);
        SparseArray sparseArray = this.A01;
        sparseArray.put(i, (Object) null);
        sparseArray.remove(i);
        super.A0E(viewGroup, obj, i);
    }
}

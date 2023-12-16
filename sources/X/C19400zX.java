package X;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.0zX  reason: invalid class name and case insensitive filesystem */
public class C19400zX extends AnonymousClass034 implements AnonymousClass675 {
    public final Context A00;
    public final C56972sr A01;
    public final C64773Ex A02;
    public final C105365Uq A03;
    public final C105165Tv A04;
    public final AnonymousClass677 A05;
    public final C55832qz A06;
    public final AnonymousClass543 A07;

    public View A03(Context context, Cursor cursor, ViewGroup viewGroup) {
        throw new AssertionError();
    }

    public void A04(View view, Context context, Cursor cursor) {
        throw new AssertionError();
    }

    public C624134x B8h(int i) {
        return B8i(this.A02, i);
    }

    public C624134x B8i(Cursor cursor, int i) {
        if (cursor == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.A06.A03(cursor);
    }

    public int B8m(C624134x r2, int i) {
        C105165Tv r0 = this.A04;
        C626936e.A06(r2);
        return r0.A00(r2);
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return B8i(this.A02, i);
    }

    public int getItemViewType(int i) {
        C624134x B8i = B8i(this.A02, i);
        C105165Tv r0 = this.A04;
        C626936e.A06(B8i);
        return r0.A00(B8i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        return BEJ(view, viewGroup, B8i(this.A02, i), i);
    }

    public C19400zX(Context context, C56972sr r2, C64773Ex r3, C105365Uq r4, C105165Tv r5, AnonymousClass677 r6, C55832qz r7, AnonymousClass543 r8) {
        super(context);
        this.A00 = context;
        this.A01 = r2;
        this.A02 = r3;
        this.A06 = r7;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r6;
        this.A07 = r8;
    }

    public View BEJ(View view, ViewGroup viewGroup, C624134x r9, int i) {
        C93314oJ r7;
        AnonymousClass3ZH A002;
        StringBuilder A0u = C18290x4.A0u(r9);
        A0u.append("ModifiedMessagesAdapter/getView message null, position=");
        A0u.append(i);
        A0u.append(", count=");
        C626936e.A07(r9, AnonymousClass000.A0h(A0u, getCount()));
        if (view == null) {
            C105165Tv r2 = this.A04;
            viewGroup.getClass();
            r7 = r2.A03(viewGroup.getContext(), this.A05, r9);
        } else {
            boolean z = false;
            if (getItemViewType(i) <= getViewTypeCount()) {
                z = true;
            }
            C626936e.A0F(z, "The view type used to find a recycled view (convertView) should correspond to the number of types of conversation rows");
            r7 = (C93314oJ) view;
            r7.A1q(r9, true);
        }
        ImageView A0F = AnonymousClass0x9.A0F(r7, R.id.profile_picture);
        AnonymousClass0YY.A06(A0F, 2);
        AnonymousClass2z0 r0 = r9.A1J;
        C95814uZ r5 = r0.A00;
        boolean z2 = r5 instanceof C95804uY;
        if (z2) {
            C64773Ex r22 = this.A02;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("newsletter chatJid is null, message: ");
            A0o.append(r9);
            C626936e.A07(r5, AnonymousClass000.A0b(", isNewsletter: ", A0o, z2));
            A002 = r22.A0A(r5);
        } else if (r0.A02) {
            A002 = C56972sr.A01(this.A01);
            C626936e.A06(A002);
        } else {
            A002 = C64773Ex.A00(this.A02, r9.A0o());
        }
        this.A03.A08(A0F, A002);
        r7.setOnClickListener(this.A07);
        if ((r7 instanceof C93204o8) && ((AnonymousClass1nE) r7.getFMessage()).A02) {
            C93204o8 r02 = (C93204o8) r7;
            r02.A02 = true;
            StickerView stickerView = r02.A04.A0F;
            if (stickerView != null) {
                stickerView.A03 = true;
                stickerView.A07();
            }
        }
        return r7;
    }

    public int getViewTypeCount() {
        return 112;
    }
}

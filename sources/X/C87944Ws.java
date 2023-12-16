package X;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.stickers.StickerView;
import java.util.AbstractCollection;
import java.util.Map;

/* renamed from: X.4Ws  reason: invalid class name and case insensitive filesystem */
public final class C87944Ws extends AnonymousClass0R6 {
    public Cursor A00;
    public Map A01 = C73813g7.A0A();
    public final AnonymousClass5D1 A02;
    public final C105365Uq A03;
    public final C105165Tv A04;
    public final AnonymousClass677 A05;
    public final C55832qz A06;
    public final AnonymousClass543 A07;

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        LayoutInflater A0D = C18280x3.A0D(viewGroup);
        if (i == -1) {
            return new C88144Xm(C18300x5.A0F(A0D, viewGroup, R.layout.f8nameremoved));
        }
        View inflate = A0D.inflate(R.layout.f8nameremoved, viewGroup, false);
        AnonymousClass5D1 r0 = this.A02;
        C162457s7.A0H(inflate);
        C105365Uq r5 = this.A03;
        C105165Tv r6 = this.A04;
        AnonymousClass677 r7 = this.A05;
        AnonymousClass543 r8 = this.A07;
        C64333Db r02 = r0.A00.A03;
        return new C93584oq(inflate, C64333Db.A06(r02), C64333Db.A26(r02), r5, r6, r7, r8);
    }

    public int A0G() {
        int count;
        Cursor cursor = this.A00;
        if (cursor == null || (count = cursor.getCount()) == 0) {
            return 0;
        }
        return count + 1;
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r10, int i) {
        String str;
        AnonymousClass3ZH A072;
        AnonymousClass2z0 r0;
        C88144Xm r102 = (C88144Xm) r10;
        C162457s7.A0J(r102, 0);
        if (r102 instanceof C93584oq) {
            Cursor cursor = this.A00;
            C626936e.A06(cursor);
            cursor.moveToPosition(i - 1);
            C624134x A032 = this.A06.A03(cursor);
            C626936e.A06(A032);
            C162457s7.A0D(A032);
            C93584oq r103 = (C93584oq) r102;
            Map map = this.A01;
            C42602Ou A11 = A032.A11();
            if (A11 == null || (r0 = A11.A02) == null || (str = r0.A01) == null) {
                str = A032.A1J.A01;
            }
            C162457s7.A0H(str);
            AbstractCollection abstractCollection = (AbstractCollection) map.get(str);
            if (abstractCollection == null) {
                abstractCollection = AnonymousClass001.A0s();
            }
            int size = abstractCollection.size();
            Context A0F = C18290x4.A0F(r103.A0H);
            C93314oJ r3 = r103.A00;
            if (r3 == null) {
                r3 = r103.A07.A03(A0F, r103.A08, A032);
                r3.setRecipientNameVisibility(false);
            } else {
                r3.A1q(A032, true);
            }
            ImageView A0F2 = AnonymousClass0x9.A0F(r3, R.id.profile_picture);
            AnonymousClass0YY.A06(A0F2, 2);
            if (A032.A1J.A02) {
                A072 = C56972sr.A01(r103.A03);
            } else {
                UserJid A0o = A032.A0o();
                if (A0o != null) {
                    A072 = r103.A05.A07(A0o);
                } else {
                    throw AnonymousClass001.A0g("senderUserJid can't be null since it is a groupJid");
                }
            }
            if (A072 != null) {
                r103.A06.A08(A0F2, A072);
                r3.setOnClickListener(r103.A09);
                if (r3 instanceof C93204o8) {
                    C93204o8 r1 = (C93204o8) r3;
                    if (((AnonymousClass1nE) ((C30471mV) r1.A0S)).A02) {
                        r1.A02 = true;
                        StickerView stickerView = r1.A04.A0F;
                        if (stickerView != null) {
                            stickerView.A03 = true;
                            stickerView.A07();
                        }
                    }
                }
                if (r103.A00 == null) {
                    r103.A02.addView(r3);
                    r103.A00 = r3;
                }
                WaTextView waTextView = r103.A04;
                C109345eT.A00(waTextView, abstractCollection, 45);
                Context context = r103.A02.getContext();
                Object[] A0M = AnonymousClass002.A0M();
                A0M[0] = C107575bX.A04(context, AnonymousClass5Yj.A02(context, R.attr.f3nameremoved, R.color.f5nameremoved));
                AnonymousClass000.A1P(A0M, size, 1);
                waTextView.setText(C107575bX.A01(context, A0M, R.plurals.f9nameremoved, size));
                return;
            }
            throw AnonymousClass001.A0g("sender can't be null");
        }
    }

    public int getItemViewType(int i) {
        if (i == 0) {
            return -1;
        }
        C105165Tv r2 = this.A04;
        Cursor cursor = this.A00;
        C626936e.A06(cursor);
        cursor.moveToPosition(i - 1);
        C624134x A032 = this.A06.A03(cursor);
        C626936e.A06(A032);
        C162457s7.A0D(A032);
        return r2.A00(A032);
    }

    public C87944Ws(AnonymousClass5D1 r2, C105365Uq r3, C105165Tv r4, AnonymousClass677 r5, C55832qz r6, AnonymousClass543 r7) {
        C18260x0.A0Q(r6, r2);
        this.A06 = r6;
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = r4;
        this.A05 = r5;
        this.A07 = r7;
    }
}

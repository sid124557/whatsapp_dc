package X;

import android.database.Cursor;
import android.database.DataSetObserver;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.gallery.DocumentsGalleryFragment;
import com.whatsapp.gallery.LinksGalleryFragment;
import java.io.File;
import java.util.Locale;

/* renamed from: X.4X2  reason: invalid class name */
public abstract class AnonymousClass4X2 extends AnonymousClass0R6 {
    public int A00;
    public Cursor A01 = null;
    public boolean A02 = false;
    public final DataSetObserver A03;

    public AnonymousClass4X2() {
        int i;
        C124496Co r2 = new C124496Co(this);
        this.A03 = r2;
        Cursor cursor = this.A01;
        if (cursor != null) {
            i = cursor.getColumnIndex("_id");
        } else {
            i = -1;
        }
        this.A00 = i;
        A0E(true);
        Cursor cursor2 = this.A01;
        if (cursor2 != null) {
            cursor2.registerDataSetObserver(r2);
        }
    }

    public void A0E(boolean z) {
        super.A0E(true);
    }

    public void BNf(C05570Ua r3, int i) {
        C162457s7.A0J(r3, 0);
        if (this.A02) {
            Cursor cursor = this.A01;
            if (cursor == null || !cursor.moveToPosition(i)) {
                throw C86604Kt.A0h("couldn't move cursor to position ", AnonymousClass001.A0o(), i);
            }
            A0L(this.A01, r3);
            return;
        }
        throw AnonymousClass001.A0e("this should only be called when the cursor is valid");
    }

    public long A0B(int i) {
        Cursor cursor;
        Cursor cursor2 = this.A01;
        boolean z = false;
        if (cursor2 != null) {
            z = C18310x6.A1W(cursor2.moveToPosition(i) ? 1 : 0);
        }
        if (!z || (cursor = this.A01) == null) {
            return 0;
        }
        return cursor.getLong(this.A00);
    }

    public int A0G() {
        Cursor cursor = this.A01;
        if (cursor != null) {
            return cursor.getCount();
        }
        return 0;
    }

    public Cursor A0K(Cursor cursor) {
        Cursor cursor2 = this.A01;
        if (cursor == cursor2) {
            return null;
        }
        DataSetObserver dataSetObserver = this.A03;
        if (!(dataSetObserver == null || cursor2 == null)) {
            cursor2.unregisterDataSetObserver(dataSetObserver);
        }
        this.A01 = cursor;
        int i = 0;
        boolean A1W = AnonymousClass000.A1W(cursor);
        this.A02 = A1W;
        if (A1W) {
            if (!(dataSetObserver == null || cursor == null)) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
            Cursor cursor3 = this.A01;
            if (cursor3 != null) {
                i = cursor3.getColumnIndexOrThrow("_id");
            }
        } else {
            i = -1;
        }
        this.A00 = i;
        A05();
        return cursor2;
    }

    public void A0L(Cursor cursor, C05570Ua r11) {
        CharSequence A0d;
        String str;
        if (this instanceof C95244su) {
            int A04 = AnonymousClass0x2.A04(cursor, "link_index");
            LinksGalleryFragment linksGalleryFragment = ((C95244su) this).A00;
            ((AnonymousClass4Z3) r11).A07(linksGalleryFragment.A0F.A04(cursor, linksGalleryFragment.A0D), A04);
            return;
        }
        C88444Yt r112 = (C88444Yt) r11;
        C30471mV A002 = ((C86684Lb) cursor).A00();
        C626936e.A06(A002);
        AnonymousClass1nF r6 = (AnonymousClass1nF) A002;
        r112.A00 = r6;
        ImageView imageView = r112.A05;
        DocumentsGalleryFragment documentsGalleryFragment = r112.A0B;
        imageView.setImageDrawable(AnonymousClass5VP.A00(documentsGalleryFragment.A1D(), r6));
        boolean A1Z = C86614Ku.A1Z(r6);
        TextView textView = r112.A09;
        if (!A1Z) {
            A0d = C86644Kx.A0d(documentsGalleryFragment.A1D(), documentsGalleryFragment.A05, C107075ae.A03, r6.A1w(), ((AnonymousClass677) C86654Ky.A0O(documentsGalleryFragment)).getSearchTerms());
        } else if (!TextUtils.isEmpty(r6.A1x())) {
            A0d = C627536m.A09(r6.A1x());
        } else {
            A0d = C08310eF.A09(documentsGalleryFragment).getString(R.string.f11nameremoved);
        }
        textView.setText(A0d);
        File A012 = C30471mV.A01(r6);
        TextView textView2 = r112.A08;
        if (A012 != null) {
            C86634Kw.A1J(textView2, documentsGalleryFragment.A05, A012.length());
            textView2.setVisibility(0);
            r112.A03.setVisibility(0);
        } else {
            textView2.setVisibility(8);
            r112.A03.setVisibility(8);
        }
        if (r6.A00 != 0) {
            TextView textView3 = r112.A07;
            textView3.setVisibility(0);
            r112.A01.setVisibility(0);
            textView3.setText(C107105ah.A01(documentsGalleryFragment.A05, r6));
        } else {
            r112.A07.setVisibility(8);
            r112.A01.setVisibility(8);
        }
        String A022 = C106695a0.A02(r6.A05);
        Locale locale = Locale.US;
        String upperCase = A022.toUpperCase(locale);
        if (TextUtils.isEmpty(upperCase) && !TextUtils.isEmpty(r6.A1x())) {
            String A1x = r6.A1x();
            C626936e.A06(A1x);
            upperCase = C627536m.A08(A1x).toUpperCase(locale);
        }
        r112.A0A.setText(upperCase);
        TextView textView4 = r112.A06;
        if (A012 != null) {
            textView4.setText(C107565bW.A0F(documentsGalleryFragment.A05, r6.A0K, false));
            str = C107565bW.A0F(documentsGalleryFragment.A05, r6.A0K, true);
        } else {
            str = "";
            textView4.setText(str);
        }
        textView4.setContentDescription(str);
        View view = r112.A04;
        View view2 = r112.A02;
        boolean A023 = C106215Yb.A02(r6);
        boolean z = r6.A1F;
        C86624Kv.A11(view2, A023 ? 1 : 0, 0, 8);
        C86624Kv.A11(view, z ? 1 : 0, 0, 8);
        boolean BIB = ((AnonymousClass677) C86654Ky.A0O(documentsGalleryFragment)).BIB(r6);
        View view3 = r112.A0H;
        if (BIB) {
            C86604Kt.A0z(documentsGalleryFragment.A0G(), view3, R.color.f5nameremoved);
            view3.setSelected(true);
            return;
        }
        view3.setBackgroundResource(R.drawable.selector_orange_gradient);
        view3.setSelected(false);
    }
}

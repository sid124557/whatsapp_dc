package com.whatsapp.profile;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0R8;
import X.AnonymousClass0RP;
import X.AnonymousClass0Y8;
import X.AnonymousClass0YY;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass33K;
import X.AnonymousClass3FI;
import X.AnonymousClass4L0;
import X.AnonymousClass4OV;
import X.AnonymousClass4SG;
import X.AnonymousClass54Q;
import X.AnonymousClass5b0;
import X.AnonymousClass6G6;
import X.AnonymousClass7PX;
import X.AnonymousClass91S;
import X.C05040Rr;
import X.C106815aD;
import X.C107695bk;
import X.C159487lv;
import X.C167227zy;
import X.C18300x5;
import X.C33951tx;
import X.C47432dF;
import X.C54292oU;
import X.C54722pB;
import X.C56492s4;
import X.C56512s6;
import X.C633939b;
import X.C64333Db;
import X.C85014Ep;
import X.C86604Kt;
import X.C86614Ku;
import X.C86634Kw;
import X.C86654Ky;
import X.C86664Kz;
import X.C89164br;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class WebImagePicker extends C89164br {
    public int A00;
    public int A01;
    public Uri A02;
    public View.OnClickListener A03;
    public View A04;
    public View A05;
    public ProgressBar A06;
    public SearchView A07;
    public C56492s4 A08;
    public C56512s6 A09;
    public C54292oU A0A;
    public AnonymousClass33K A0B;
    public C33951tx A0C;
    public AnonymousClass4OV A0D;
    public AnonymousClass7PX A0E;
    public C54722pB A0F;
    public AnonymousClass3FI A0G;
    public File A0H;
    public boolean A0I;
    public final C85014Ep A0J;
    public final ArrayList A0K;

    public void A5r() {
        if (!this.A0I) {
            this.A0I = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            AnonymousClass4SG.A3i(this);
            this.A0G = (AnonymousClass3FI) A2Y.AZM.get();
            this.A0A = C64333Db.A2q(A2Y);
            this.A08 = C64333Db.A07(A2Y);
            this.A0B = C86654Ky.A0Y(A2Y);
            this.A09 = C86664Kz.A18(A2Y);
        }
    }

    public final void A76() {
        String charSequence = this.A07.A0k.getText().toString();
        if (TextUtils.isEmpty(charSequence)) {
            this.A05.A0H(R.string.f11nameremoved, 0);
            return;
        }
        this.A0B.A02(this.A07);
        this.A06.setVisibility(0);
        C86634Kw.A1I((TextView) getListView().getEmptyView());
        AnonymousClass4OV r2 = this.A0D;
        if (charSequence != null) {
            AnonymousClass54Q r0 = r2.A00;
            if (r0 != null) {
                r0.A0D(false);
            }
            r2.A01 = true;
            WebImagePicker webImagePicker = r2.A02;
            webImagePicker.A0E = new AnonymousClass7PX(webImagePicker.A08, webImagePicker.A0A, webImagePicker.A0B, charSequence);
            webImagePicker.A0K.clear();
            webImagePicker.A0F.A00();
            C47432dF r6 = new C47432dF(webImagePicker.A05, webImagePicker.A08, webImagePicker.A0B, webImagePicker.A0H, "web-image-picker-adapter");
            r6.A00 = webImagePicker.A01;
            r6.A01 = 4194304;
            r6.A03 = AnonymousClass0RP.A00(webImagePicker, R.drawable.gray_rectangle);
            r6.A02 = AnonymousClass0RP.A00(webImagePicker, R.drawable.ic_missing_thumbnail_picture);
            webImagePicker.A0F = r6.A01();
        }
        AnonymousClass54Q r1 = new AnonymousClass54Q(r2);
        r2.A00 = r1;
        AnonymousClass0x7.A1B(r1, r2.A02.A04);
        if (charSequence != null) {
            r2.notifyDataSetChanged();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 151) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            A76();
        } else {
            finish();
        }
    }

    public WebImagePicker(int i) {
        this.A0I = false;
        C86604Kt.A1K(this, 80);
    }

    public final void A75() {
        int A002 = (int) (C86604Kt.A00(this) * 3.3333333f);
        this.A01 = ((int) (C86604Kt.A00(this) * 83.333336f)) + (((int) (C86604Kt.A00(this) * 1.3333334f)) * 2) + A002;
        Point A072 = AnonymousClass4L0.A07();
        C86604Kt.A0x(this, A072);
        int i = A072.x;
        int i2 = i / this.A01;
        this.A00 = i2;
        this.A01 = (i / i2) - A002;
        C54722pB r0 = this.A0F;
        if (r0 != null) {
            r0.A00();
        }
        C47432dF r2 = new C47432dF(this.A05, this.A08, this.A0B, this.A0H, "web-image-picker");
        r2.A00 = this.A01;
        r2.A01 = 4194304;
        r2.A03 = AnonymousClass0RP.A00(this, R.drawable.picture_loading);
        r2.A02 = AnonymousClass0RP.A00(this, R.drawable.ic_missing_thumbnail_picture);
        this.A0F = r2.A01();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A75();
        this.A0D.notifyDataSetChanged();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        this.A0H = AnonymousClass002.A0A(getCacheDir(), "Thumbs");
        AnonymousClass0R8 A0R = C86634Kw.A0R(this);
        A0R.A0N(true);
        A0R.A0Q(false);
        A0R.A0O(true);
        this.A0H.mkdirs();
        AnonymousClass7PX r0 = new AnonymousClass7PX(this.A08, this.A0A, this.A0B, "");
        this.A0E = r0;
        File[] listFiles = r0.A06.listFiles();
        if (listFiles != null) {
            Arrays.sort(listFiles, new AnonymousClass91S(48));
            int i = 0;
            while (true) {
                int length = listFiles.length;
                if (i >= length) {
                    break;
                }
                File file = listFiles[i];
                if (i <= length - 16 || file.lastModified() + 86400000 <= System.currentTimeMillis()) {
                    file.delete();
                }
                i++;
            }
        }
        setContentView((int) R.layout.f8nameremoved);
        this.A06 = (ProgressBar) findViewById(R.id.indefiniteProgressBar);
        String stringExtra = getIntent().getStringExtra("query");
        if (stringExtra != null) {
            stringExtra = C106815aD.A03(stringExtra);
        }
        AnonymousClass6G6 r7 = new AnonymousClass6G6(A0R.A02(), this);
        this.A07 = r7;
        TextView A092 = AnonymousClass002.A09(r7, R.id.search_src_text);
        int A032 = C18300x5.A03(this, R.attr.f3nameremoved, R.color.f5nameremoved);
        A092.setTextColor(A032);
        A092.setHintTextColor(AnonymousClass0Y8.A04(this, R.color.f5nameremoved));
        ImageView A0F2 = AnonymousClass0x9.A0F(r7, R.id.search_close_btn);
        C05040Rr.A01(PorterDuff.Mode.SRC_IN, A0F2);
        C05040Rr.A00(ColorStateList.valueOf(A032), A0F2);
        this.A07.setQueryHint(getString(R.string.f11nameremoved));
        this.A07.A09();
        SearchView searchView = this.A07;
        searchView.A0A = new C167227zy();
        searchView.A0H(stringExtra);
        SearchView searchView2 = this.A07;
        searchView2.A07 = new C633939b(this, 39);
        searchView2.A0B = new C159487lv(this, 4);
        A0R.A0G(searchView2);
        Bundle A0D2 = C86614Ku.A0D(this);
        if (A0D2 != null) {
            this.A02 = (Uri) A0D2.getParcelable("output");
        }
        ListView listView = getListView();
        listView.requestFocus();
        listView.setClickable(false);
        AnonymousClass0YY.A04((Drawable) null, listView);
        listView.setDividerHeight(0);
        View inflate = getLayoutInflater().inflate(R.layout.f8nameremoved, listView, false);
        listView.addFooterView(inflate, (Object) null, false);
        listView.setFooterDividersEnabled(false);
        this.A05 = inflate.findViewById(R.id.progress);
        this.A04 = inflate.findViewById(R.id.attribution);
        AnonymousClass4OV r02 = new AnonymousClass4OV(this);
        this.A0D = r02;
        A74(r02);
        this.A03 = new C633939b(this, 40);
        A75();
        this.A09.A07(this.A0J);
        this.A07.requestFocus();
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0K.clear();
        this.A0F.A02.A03(true);
        C33951tx r0 = this.A0C;
        if (r0 != null) {
            r0.A0D(true);
            Log.i("webimagesearch/cancel_image_download_task");
            if (this.A0C.A00 != null) {
                Log.i("webimagesearch/cancel_dialog");
                this.A0C.A00.dismiss();
                this.A0C.A00 = null;
            }
            this.A0C = null;
        }
        AnonymousClass54Q r1 = this.A0D.A00;
        if (r1 != null) {
            r1.A0D(false);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    public WebImagePicker() {
        this(0);
        this.A0K = AnonymousClass001.A0s();
        this.A00 = 4;
        this.A0J = new AnonymousClass5b0(this, 1);
    }
}

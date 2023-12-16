package com.whatsapp.stickers.store.preview;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0O5;
import X.AnonymousClass0x9;
import X.AnonymousClass121;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass2IE;
import X.AnonymousClass2IF;
import X.AnonymousClass2X1;
import X.AnonymousClass33O;
import X.AnonymousClass48W;
import X.AnonymousClass48Y;
import X.AnonymousClass49Y;
import X.AnonymousClass4H3;
import X.AnonymousClass4HO;
import X.AnonymousClass4HY;
import X.AnonymousClass4JP;
import X.AnonymousClass5ZD;
import X.C107335b8;
import X.C107695bk;
import X.C109675f0;
import X.C117635sF;
import X.C131666dx;
import X.C162457s7;
import X.C18280x3;
import X.C18300x5;
import X.C29351ig;
import X.C29361ih;
import X.C33361ss;
import X.C33961ty;
import X.C49652gs;
import X.C49912hI;
import X.C50612iT;
import X.C53082mW;
import X.C54992pc;
import X.C55862r2;
import X.C56512s6;
import X.C56872sh;
import X.C56932sn;
import X.C58422vE;
import X.C59622xD;
import X.C627736r;
import X.C64333Db;
import X.C68743Ui;
import X.C68773Ul;
import X.C85174Ff;
import X.C86004Il;
import X.C88834as;
import X.C89644eZ;
import X.C989753y;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.stickers.StickerView;
import com.whatsapp.stickers.stickerpack.StickerPackDownloader;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Map;

public class StickerStorePackPreviewActivity extends C89644eZ implements AnonymousClass49Y, AnonymousClass48W, AnonymousClass48Y {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public ImageView A05;
    public ImageView A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public GridLayoutManager A0A;
    public RecyclerView A0B;
    public C56512s6 A0C;
    public C54992pc A0D;
    public C49652gs A0E;
    public AnonymousClass5ZD A0F;
    public C29351ig A0G;
    public C55862r2 A0H;
    public C49912hI A0I;
    public AnonymousClass33O A0J;
    public C29361ih A0K;
    public C50612iT A0L;
    public C56932sn A0M;
    public StickerView A0N;
    public AnonymousClass2X1 A0O;
    public StickerPackDownloader A0P;
    public AnonymousClass121 A0Q;
    public C33961ty A0R;
    public WDSButton A0S;
    public WDSButton A0T;
    public WDSButton A0U;
    public String A0V;
    public Map A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public final ViewTreeObserver.OnGlobalLayoutListener A0e;
    public final AnonymousClass0O5 A0f;
    public final C85174Ff A0g;
    public final C56872sh A0h;
    public final AnonymousClass2IF A0i;

    public static /* synthetic */ void A0C(C50612iT r4, StickerStorePackPreviewActivity stickerStorePackPreviewActivity) {
        stickerStorePackPreviewActivity.A0L = r4;
        stickerStorePackPreviewActivity.A0d = true;
        AnonymousClass2IE r1 = new AnonymousClass2IE(stickerStorePackPreviewActivity);
        Log.d("StickerStorePackPreviewActivity/getStickerPreviewState/begin");
        C33361ss r3 = new C33361ss(stickerStorePackPreviewActivity.A0M, r1);
        stickerStorePackPreviewActivity.A04.BkL(r3, r4);
    }

    public void A5r() {
        if (!this.A0Z) {
            this.A0Z = true;
            C88834as A0I2 = C18280x3.A0I(this);
            C64333Db r1 = A0I2.A4Z;
            AnonymousClass1Hf.A2G(r1, this);
            C107695bk r0 = r1.A00;
            AnonymousClass1Ha.A23(r1, r0, r0, this);
            AnonymousClass1Ha.A24(r1, this);
            this.A0H = (C55862r2) r1.A1T.get();
            this.A0D = A0I2.ACR();
            this.A0K = (C29361ih) r1.AX3.get();
            this.A0C = (C56512s6) r1.AK3.get();
            this.A0M = (C56932sn) r1.AXB.get();
            this.A0E = (C49652gs) r1.A1G.get();
            this.A0P = (StickerPackDownloader) r1.AX5.get();
            this.A0J = (AnonymousClass33O) r1.AX1.get();
            this.A0F = (AnonymousClass5ZD) A0I2.A04.get();
            this.A0I = (C49912hI) r1.AWV.get();
            this.A0G = (C29351ig) r1.A1I.get();
            this.A0O = (AnonymousClass2X1) r1.AWv.get();
        }
    }

    public final void A75(C50612iT r6) {
        String A0V2;
        if (!r6.A0T) {
            String str = r6.A0N;
            if (!TextUtils.isEmpty(str) && (A0V2 = AnonymousClass000.A0V("https://static.whatsapp.net/sticker?img=", str, AnonymousClass001.A0o())) != null) {
                String A002 = this.A0I.A00(AnonymousClass000.A0X(this.A0D.A0R(C58422vE.A02, 6785), AnonymousClass000.A0l(A0V2)));
                if (A002 != null) {
                    this.A0M.A02().A03(this.A06, A002);
                    return;
                }
            }
        }
        this.A0M.A0B(r6, new C68773Ul(this.A06, r6.A0G));
    }

    public final void A76(boolean z) {
        C50612iT r0 = this.A0L;
        if (r0 != null && r0.A05 != null) {
            this.A06.setImageResource(R.drawable.sticker_empty);
            AnonymousClass121 r2 = this.A0Q;
            for (C53082mW r02 : AnonymousClass121.A00(r2)) {
                r02.A00 = z;
            }
            r2.A05();
        }
    }

    public final boolean A77() {
        String str;
        if (this.A01.A0Y() || !this.A0D.A0Y(C58422vE.A02, 1396) || (str = this.A0V) == null || !str.equals("meta-avatar")) {
            return false;
        }
        return true;
    }

    public void BPq(C59622xD r2) {
        if (r2.A01) {
            A74();
            AnonymousClass121 r0 = this.A0Q;
            if (r0 != null) {
                r0.A05();
            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C54992pc r2 = this.A0D;
        String str = this.A0V;
        C162457s7.A0J(str, 0);
        if (!C162457s7.A0P(r2.A01(), str) && !this.A0V.contains(" ")) {
            getMenuInflater().inflate(R.menu.f10nameremoved, menu);
            MenuItem findItem = menu.findItem(R.id.menu_sticker_pack_share);
            Drawable icon = findItem.getIcon();
            icon.mutate();
            icon.setColorFilter(getResources().getColor(R.color.f5nameremoved), PorterDuff.Mode.SRC_IN);
            findItem.setVisible(true);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public StickerStorePackPreviewActivity(int i) {
        this.A0Z = false;
        AnonymousClass4HY.A00(this, 121);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008b, code lost:
        if (r2.A0T != false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ff, code lost:
        if (r2.A00() == false) goto L_0x0101;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A74() {
        /*
            r8 = this;
            boolean r0 = r8.isFinishing()
            if (r0 != 0) goto L_0x0083
            X.2iT r2 = r8.A0L
            r5 = 8
            r3 = 0
            if (r2 == 0) goto L_0x017c
            android.view.View r0 = r8.A04
            r0.setVisibility(r5)
            android.view.View r0 = r8.A01
            r0.setVisibility(r3)
            android.widget.TextView r1 = r8.A08
            java.lang.String r0 = r2.A0I
            r1.setText(r0)
            android.widget.TextView r1 = r8.A07
            java.lang.String r0 = r2.A0A
            r1.setText(r0)
            android.widget.TextView r7 = r8.A09
            r6 = 2131894073(0x7f121f39, float:1.942294E38)
            r4 = 1
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = r2.A0K
            r1[r3] = r0
            X.AnonymousClass001.A0y(r8, r7, r1, r6)
            android.widget.ImageView r1 = r8.A05
            boolean r0 = r8.A0c
            if (r0 != 0) goto L_0x0175
            boolean r0 = r2.A0O
            if (r0 != 0) goto L_0x0179
        L_0x003e:
            r0 = 8
        L_0x0040:
            r1.setVisibility(r0)
            r8.A75(r2)
            boolean r0 = r2.A06
            if (r0 != 0) goto L_0x018d
            boolean r0 = r8.A0Y
            if (r0 != 0) goto L_0x018d
            boolean r0 = r8.A0d
            if (r0 != 0) goto L_0x018d
            boolean r0 = r8.A77()
            if (r0 == 0) goto L_0x0084
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0S
            r0.setVisibility(r5)
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0T
            r0.setVisibility(r5)
            android.view.View r0 = r8.A03
            r0.setVisibility(r5)
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0U
            r0.setVisibility(r3)
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0U
            r0.setClickable(r4)
            r8.A76(r3)
            r8.A75(r2)
        L_0x0077:
            r0 = 2131431384(0x7f0b0fd8, float:1.8484496E38)
            android.view.View r0 = r8.findViewById(r0)
            if (r0 == 0) goto L_0x0083
            X.C107295b4.A02(r0)
        L_0x0083:
            return
        L_0x0084:
            java.lang.String r0 = r2.A03
            if (r0 != 0) goto L_0x008d
            boolean r0 = r2.A0T
            r1 = 0
            if (r0 == 0) goto L_0x008e
        L_0x008d:
            r1 = 1
        L_0x008e:
            android.view.View r0 = r8.A03
            r0.setVisibility(r5)
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0U
            r0.setVisibility(r5)
            if (r1 == 0) goto L_0x00f1
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0T
            r0.setVisibility(r5)
            long r1 = r2.A02
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e2
            X.33j r0 = r8.A00
            java.lang.String r2 = X.AnonymousClass35V.A03(r0, r1)
            r0 = 2131894003(0x7f121ef3, float:1.9422798E38)
            java.lang.String r1 = X.AnonymousClass0x2.A0X(r8, r2, r4, r0)
            r0 = 2131894063(0x7f121f2f, float:1.942292E38)
            java.lang.String r0 = X.AnonymousClass0x2.A0X(r8, r2, r4, r0)
        L_0x00bb:
            X.0PJ r0 = X.AnonymousClass0x9.A0G(r1, r0)
            java.lang.Object r2 = r0.A00
            X.C626936e.A06(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r0.A01
            X.C626936e.A06(r1)
            java.lang.String r1 = (java.lang.String) r1
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0S
            r0.setText(r2)
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0S
            r0.setContentDescription(r1)
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0S
            r0.setClickable(r4)
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0S
        L_0x00de:
            r0.setVisibility(r3)
            goto L_0x0077
        L_0x00e2:
            r0 = 2131894002(0x7f121ef2, float:1.9422796E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131894062(0x7f121f2e, float:1.9422918E38)
            java.lang.String r0 = r8.getString(r0)
            goto L_0x00bb
        L_0x00f1:
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0S
            r0.setVisibility(r5)
            java.lang.String r0 = r2.A03
            if (r0 == 0) goto L_0x0101
            boolean r0 = r2.A00()
            r7 = 1
            if (r0 != 0) goto L_0x0102
        L_0x0101:
            r7 = 0
        L_0x0102:
            long r1 = r2.A02
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1W(r0)
            if (r7 == 0) goto L_0x0153
            if (r0 == 0) goto L_0x0148
            X.33j r0 = r8.A00
            java.lang.String r2 = X.AnonymousClass35V.A03(r0, r1)
            r0 = 2131894027(0x7f121f0b, float:1.9422847E38)
            java.lang.String r1 = X.AnonymousClass0x2.A0X(r8, r2, r4, r0)
            r0 = 2131894028(0x7f121f0c, float:1.942285E38)
        L_0x0120:
            java.lang.String r0 = X.AnonymousClass0x2.A0X(r8, r2, r4, r0)
        L_0x0124:
            X.0PJ r0 = X.AnonymousClass0x9.A0G(r1, r0)
            java.lang.Object r2 = r0.A00
            X.C626936e.A06(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r0.A01
            X.C626936e.A06(r1)
            java.lang.String r1 = (java.lang.String) r1
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0T
            r0.setText(r2)
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0T
            r0.setContentDescription(r1)
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0T
            r0.setClickable(r4)
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0T
            goto L_0x00de
        L_0x0148:
            r0 = 2131894025(0x7f121f09, float:1.9422843E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131894026(0x7f121f0a, float:1.9422845E38)
            goto L_0x0170
        L_0x0153:
            if (r0 == 0) goto L_0x0166
            X.33j r0 = r8.A00
            java.lang.String r2 = X.AnonymousClass35V.A03(r0, r1)
            r0 = 2131894008(0x7f121ef8, float:1.9422809E38)
            java.lang.String r1 = X.AnonymousClass0x2.A0X(r8, r2, r4, r0)
            r0 = 2131894067(0x7f121f33, float:1.9422928E38)
            goto L_0x0120
        L_0x0166:
            r0 = 2131894008(0x7f121ef8, float:1.9422809E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131894066(0x7f121f32, float:1.9422926E38)
        L_0x0170:
            java.lang.String r0 = r8.getString(r0)
            goto L_0x0124
        L_0x0175:
            boolean r0 = r2.A0Q
            if (r0 == 0) goto L_0x003e
        L_0x0179:
            r0 = 0
            goto L_0x0040
        L_0x017c:
            android.view.View r1 = r8.A04
            if (r1 == 0) goto L_0x0083
            android.view.View r0 = r8.A01
            if (r0 == 0) goto L_0x0083
            r1.setVisibility(r3)
            android.view.View r0 = r8.A01
            r0.setVisibility(r5)
            return
        L_0x018d:
            boolean r0 = r2.A0S
            if (r0 == 0) goto L_0x0195
            r8.A76(r4)
            return
        L_0x0195:
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0T
            java.lang.String r1 = ""
            r0.setText(r1)
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0T
            r0.setClickable(r3)
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0S
            r0.setText(r1)
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0S
            r0.setClickable(r3)
            com.whatsapp.wds.components.button.WDSButton r0 = r8.A0U
            r0.setClickable(r3)
            android.view.View r0 = r8.A03
            r0.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity.A74():void");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 28) {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        this.A0V = getIntent().getStringExtra("sticker_pack_id");
        String stringExtra = getIntent().getStringExtra("sticker_pack_preview_source");
        this.A0c = "sticker_store_my_tab".equals(stringExtra);
        this.A0a = "deeplink".equals(stringExtra);
        this.A0b = "info_dialog".equals(stringExtra);
        this.A0K.A06(this.A0h);
        if (A77()) {
            this.A0G.A06(this.A0g);
        }
        this.A0M.A0C(new C68743Ui(this), this.A0V, true);
        if (this.A0V == null) {
            Log.e("StickerStorePackPreviewActivity/onCreate no pack id passed");
            finish();
        }
        View view = this.A00;
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        toolbar.setNavigationIcon((Drawable) new C131666dx(C107335b8.A04(this, R.drawable.ic_back, R.color.f5nameremoved), this.A00));
        toolbar.setTitle((int) R.string.f11nameremoved);
        toolbar.setNavigationContentDescription((int) R.string.f11nameremoved);
        toolbar.setNavigationOnClickListener(new C109675f0((Object) this, 14));
        setSupportActionBar(toolbar);
        this.A01 = view.findViewById(R.id.details_container);
        this.A04 = view.findViewById(R.id.loading_progress);
        this.A08 = AnonymousClass002.A09(view, R.id.pack_preview_title);
        this.A09 = AnonymousClass002.A09(view, R.id.pack_preview_publisher);
        this.A07 = AnonymousClass002.A09(view, R.id.pack_preview_description);
        this.A03 = view.findViewById(R.id.pack_download_progress);
        this.A06 = AnonymousClass0x9.A0F(view, R.id.pack_tray_icon);
        this.A02 = view.findViewById(R.id.divider);
        this.A0T = (WDSButton) view.findViewById(R.id.download_btn);
        this.A0S = (WDSButton) view.findViewById(R.id.delete_btn);
        this.A0U = (WDSButton) view.findViewById(R.id.edit_avatar_btn);
        this.A05 = AnonymousClass0x9.A0F(view, R.id.sticker_pack_animation_icon);
        this.A0T.setOnClickListener(new C989753y(this, 34));
        this.A0S.setOnClickListener(new C989753y(this, 35));
        this.A0U.setOnClickListener(new C989753y(this, 36));
        this.A0A = new GridLayoutManager(1);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.sticker_preview_recycler);
        this.A0B = recyclerView;
        recyclerView.setLayoutManager(this.A0A);
        this.A0B.A0q(this.A0f);
        this.A0B.getViewTreeObserver().addOnGlobalLayoutListener(this.A0e);
        StickerView stickerView = (StickerView) view.findViewById(R.id.sticker_preview_expanded_sticker);
        this.A0N = stickerView;
        stickerView.A03 = true;
        this.A07.A06(this);
        if (A77()) {
            if (this.A0a) {
                this.A0H.A01(8);
            }
            this.A0H.A03((Boolean) null, 16);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0K.A07(this.A0h);
        AnonymousClass33O r0 = this.A0J;
        if (r0 != null) {
            r0.A03();
        }
        this.A07.A07(this);
        C33961ty r1 = this.A0R;
        if (r1 != null) {
            r1.A0D(true);
            this.A0R = null;
        }
        Map map = this.A0W;
        if (map != null) {
            this.A04.BkM(new C117635sF(C18300x5.A0v(map), 30));
            this.A0W.clear();
            this.A0W = null;
        }
        if (A77()) {
            this.A0G.A07(this.A0g);
            if (this.A0a) {
                this.A0H.A00(8);
            }
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_sticker_pack_share) {
            return super.onOptionsItemSelected(menuItem);
        }
        startActivity(C627736r.A0r(this, String.format("https://wa.me/stickerpack/%s", new Object[]{this.A0V})));
        return true;
    }

    public StickerStorePackPreviewActivity() {
        this(0);
        this.A0h = new AnonymousClass4HO(this, 0);
        this.A0g = new C86004Il(this, 1);
        this.A0d = true;
        this.A0X = false;
        this.A0f = new AnonymousClass4H3(this, 2);
        this.A0i = new AnonymousClass2IF(this);
        this.A0e = new AnonymousClass4JP(this, 3);
    }
}

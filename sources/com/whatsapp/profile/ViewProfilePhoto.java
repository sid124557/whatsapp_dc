package com.whatsapp.profile;

import X.AnonymousClass0X0;
import X.AnonymousClass0x9;
import X.AnonymousClass331;
import X.AnonymousClass3LP;
import X.AnonymousClass3ZH;
import X.AnonymousClass4AQ;
import X.AnonymousClass4MP;
import X.AnonymousClass4SG;
import X.AnonymousClass681;
import X.AnonymousClass901;
import X.C107395bF;
import X.C107695bk;
import X.C18300x5;
import X.C189058zv;
import X.C1892290m;
import X.C27991fJ;
import X.C29241iV;
import X.C29301ib;
import X.C29421in;
import X.C30191m3;
import X.C50932j0;
import X.C52472lX;
import X.C54232oO;
import X.C55702qm;
import X.C56332ro;
import X.C56452s0;
import X.C56602sG;
import X.C56892sj;
import X.C613330g;
import X.C626936e;
import X.C627536m;
import X.C634339f;
import X.C64333Db;
import X.C64393Dh;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86644Kx;
import X.C86664Kz;
import X.C97564yl;
import X.C97574ym;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ViewProfilePhoto extends C97564yl {
    public C29301ib A00;
    public C29421in A01;
    public C613330g A02;
    public C56892sj A03;
    public AnonymousClass4AQ A04;
    public C50932j0 A05;
    public C29241iV A06;
    public C52472lX A07;
    public C56452s0 A08;
    public C30191m3 A09;
    public boolean A0A;
    public boolean A0B;
    public final Handler A0C;
    public final C54232oO A0D;
    public final C56602sG A0E;
    public final C55702qm A0F;

    public class SavePhoto extends C97574ym {
        public boolean A00;

        public SavePhoto(int i) {
            this.A00 = false;
            C86604Kt.A1K(this, 79);
        }

        public SavePhoto() {
            this(0);
        }
    }

    public static /* synthetic */ void A0C(ViewProfilePhoto viewProfilePhoto) {
        AnonymousClass3ZH A0A2 = viewProfilePhoto.A04.A0A(C86604Kt.A0a(viewProfilePhoto.A09));
        viewProfilePhoto.A09 = A0A2;
        if (A0A2.A0U()) {
            viewProfilePhoto.setTitle(R.string.f11nameremoved);
        } else {
            viewProfilePhoto.A6e(viewProfilePhoto.A05.A0H(viewProfilePhoto.A09));
        }
    }

    public void A5r() {
        if (!this.A0B) {
            this.A0B = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r2 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r2, this, AnonymousClass4SG.A2t(A2Y, r2, this));
            this.A03 = C86624Kv.A0M(A2Y);
            this.A0C = C86614Ku.A0j(A2Y);
            this.A0A = A2Y.Akp();
            this.A04 = C64333Db.A26(A2Y);
            this.A05 = C64333Db.A28(A2Y);
            this.A07 = C86664Kz.A18(A2Y);
            this.A06 = (C56332ro) A2Y.A6Q.get();
            this.A08 = C64333Db.A2r(A2Y);
            this.A01 = C86614Ku.A0S(A2Y);
            this.A07 = C86644Kx.A0W(A2Y);
            this.A00 = C86624Kv.A0N(A2Y);
            this.A08 = (C56452s0) A2Y.ARi.get();
            this.A09 = C86634Kw.A0o(A2Y);
            this.A05 = C86664Kz.A1A(A2Y);
            this.A03 = C64333Db.A3G(A2Y);
            this.A06 = C86624Kv.A0T(A2Y);
            this.A02 = C86624Kv.A0P(A2Y);
        }
    }

    public final void A78() {
        InputStream A042;
        TextView textView;
        int i;
        if (AnonymousClass331.A00(AnonymousClass3ZH.A01(this.A09))) {
            this.A00.setVisibility(0);
            this.A0B.setVisibility(8);
            this.A02.setVisibility(8);
            return;
        }
        AnonymousClass3LP r1 = this.A0A;
        AnonymousClass3ZH r0 = this.A09;
        if (r0 == null || !C86624Kv.A1X(r0, r1)) {
            try {
                A042 = this.A02.A04(this.A09, true);
                if (A042 == null) {
                    this.A0B.setVisibility(8);
                    this.A00.setVisibility(8);
                    this.A02.setVisibility(0);
                    this.A01.setVisibility(8);
                    if (this.A09.A0U()) {
                        textView = this.A02;
                        i = R.string.f11nameremoved;
                    } else {
                        textView = this.A02;
                        i = R.string.f11nameremoved;
                    }
                    textView.setText(i);
                    return;
                }
                this.A0B.setVisibility(0);
                this.A02.setVisibility(8);
                if (this.A09.A05 == 0) {
                    this.A00.setVisibility(0);
                } else {
                    this.A00.setVisibility(8);
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inDither = true;
                Bitmap decodeStream = BitmapFactory.decodeStream(A042, (Rect) null, options);
                this.A0B.A06(decodeStream);
                this.A01.setImageBitmap(decodeStream);
                A042.close();
                return;
            } catch (IOException unused) {
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            this.A00.setVisibility(8);
            this.A0B.setVisibility(8);
            this.A02.setVisibility(8);
            this.A01.setImageResource(R.drawable.avatar_server_psa_large);
            return;
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        if (r7.getBooleanExtra("skip_cropping", false) != false) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r5, int r6, android.content.Intent r7) {
        /*
            r4 = this;
            r0 = 12
            r3 = -1
            r2 = 13
            if (r5 == r0) goto L_0x000d
            if (r5 == r2) goto L_0x003c
            super.onActivityResult(r5, r6, r7)
        L_0x000c:
            return
        L_0x000d:
            if (r6 != r3) goto L_0x000c
            r1 = 0
            if (r7 == 0) goto L_0x0086
            java.lang.String r0 = "is_reset"
            boolean r0 = r7.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x0033
            r0 = 1
            r4.A0D = r0
            X.1in r1 = r4.A01
            X.3ZH r0 = r4.A09
            X.4uZ r0 = X.AnonymousClass3ZH.A01(r0)
            r1.A09(r0)
            X.1m3 r1 = r4.A09
            X.3ZH r0 = r4.A09
            r1.A0E(r0)
            X.AnonymousClass0X0.A00(r4)
            return
        L_0x0033:
            java.lang.String r0 = "skip_cropping"
            boolean r0 = r7.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x0086
            goto L_0x006e
        L_0x003c:
            X.1m3 r0 = r4.A09
            java.io.File r0 = r0.A02()
            boolean r0 = r0.delete()
            if (r0 != 0) goto L_0x005e
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "viewprofilephoto/failed-delete-file"
            r1.append(r0)
            X.1m3 r0 = r4.A09
            java.io.File r0 = r0.A02()
            java.lang.String r0 = r0.getAbsolutePath()
            X.C18260x0.A1M(r1, r0)
        L_0x005e:
            if (r6 != r3) goto L_0x007c
            r0 = 1
            r4.A0D = r0
            X.1in r1 = r4.A01
            X.3ZH r0 = r4.A09
            X.4uZ r0 = X.AnonymousClass3ZH.A01(r0)
            r1.A09(r0)
        L_0x006e:
            X.1m3 r1 = r4.A09
            X.3ZH r0 = r4.A09
            boolean r0 = r1.A0G(r0)
            if (r0 == 0) goto L_0x000c
            r4.A78()
            return
        L_0x007c:
            if (r6 != 0) goto L_0x000c
            if (r7 == 0) goto L_0x000c
            X.1m3 r0 = r4.A09
            r0.A04(r7, r4)
            return
        L_0x0086:
            X.1m3 r0 = r4.A09
            r0.A05(r7, r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.profile.ViewProfilePhoto.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x01b0, code lost:
        if (X.C86624Kv.A1X(r6, r9.A0A) == false) goto L_0x00dc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0169  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            r9 = r18
            android.content.Intent r4 = r9.getIntent()
            r5 = 0
            X.C162457s7.A0J(r4, r5)
            java.lang.String r0 = "start_transition_status_bar_color"
            int r3 = r4.getIntExtra(r0, r5)
            java.lang.String r0 = "return_transition_status_bar_color"
            int r2 = r4.getIntExtra(r0, r3)
            java.lang.String r0 = "start_transition_navigation_bar_color"
            int r1 = r4.getIntExtra(r0, r5)
            java.lang.String r0 = "return_transition_navigation_bar_color"
            int r0 = r4.getIntExtra(r0, r1)
            X.7ZM r11 = new X.7ZM
            r11.<init>(r3, r1, r2, r0)
            r3 = 2131896408(0x7f122858, float:1.9427676E38)
            X.7Xa r0 = new X.7Xa
            r0.<init>()
            X.C106575Zn.A01(r9, r11, r0)
            r0 = r19
            super.onCreate(r0)
            r0 = 2131626269(0x7f0e091d, float:1.887977E38)
            r9.setContentView((int) r0)
            androidx.appcompat.widget.Toolbar r8 = X.AnonymousClass1Hf.A28(r9)
            r9.setSupportActionBar(r8)
            boolean r2 = X.AnonymousClass1Hf.A2I(r9)
            X.4uZ r4 = X.C106405Yw.A00(r9)
            X.C626936e.A06(r4)
            X.3Ex r0 = r9.A04
            X.3ZH r0 = r0.A0A(r4)
            r9.A09 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "viewprofilephoto/create "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " photo_full_id:"
            r1.append(r0)
            X.3ZH r0 = r9.A09
            int r0 = r0.A05
            X.C18260x0.A1G(r1, r0)
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "can_user_remove_photo"
            boolean r0 = r1.getBooleanExtra(r0, r2)
            r9.A0A = r0
            X.1in r1 = r9.A01
            X.2sG r0 = r9.A0E
            r1.A06(r0)
            X.1ib r1 = r9.A00
            X.2oO r0 = r9.A0D
            r1.A06(r0)
            X.1iV r1 = r9.A06
            X.2qm r0 = r9.A0F
            r1.A06(r0)
            X.1RR r6 = X.AnonymousClass4SG.A2c(r9)
            if (r6 != 0) goto L_0x009f
            java.lang.String r0 = "viewprofilephoto/create/no-me"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.AnonymousClass4SG.A36(r9)
            return
        L_0x009f:
            X.3ZH r0 = r9.A09
            boolean r0 = r0.A0U()
            if (r0 == 0) goto L_0x01b4
            r0 = 2131890005(0x7f120f55, float:1.941469E38)
        L_0x00aa:
            r9.setTitle(r0)
        L_0x00ad:
            X.4uZ r0 = r6.A0H
            boolean r4 = r4.equals(r0)
            r0 = 32000(0x7d00, double:1.581E-319)
            if (r4 == 0) goto L_0x0169
            X.3ZH r6 = r9.A09
            int r4 = r6.A05
            if (r4 <= 0) goto L_0x00e1
            X.2ro r4 = r9.A06
            java.io.File r4 = r4.A00(r6)
            if (r4 == 0) goto L_0x00e1
            boolean r4 = r4.exists()
            if (r4 != 0) goto L_0x00e1
            X.3ZH r4 = r9.A09
            r4.A05 = r5
            X.2s0 r7 = r9.A08
            X.4uZ r6 = X.AnonymousClass3ZH.A01(r4)
            X.3ZH r4 = r9.A09
            int r4 = r4.A05
            r7.A01(r6, r4, r2)
        L_0x00dc:
            android.os.Handler r4 = r9.A0C
            r4.sendEmptyMessageDelayed(r5, r0)
        L_0x00e1:
            X.30g r12 = r9.A02
            X.3ZH r14 = r9.A09
            int r16 = X.C86634Kw.A04(r9)
            float r15 = X.C18310x6.A01(r9)
            r13 = r9
            r17 = r2
            android.graphics.Bitmap r4 = r12.A03(r13, r14, r15, r16, r17)
            r0 = 2131432722(0x7f0b1512, float:1.848721E38)
            android.view.View r0 = r9.findViewById(r0)
            r9.A00 = r0
            r0 = 2131432437(0x7f0b13f5, float:1.8486631E38)
            android.view.View r0 = r9.findViewById(r0)
            com.whatsapp.mediaview.PhotoView r0 = (com.whatsapp.mediaview.PhotoView) r0
            r9.A0B = r0
            r0 = 2131431506(0x7f0b1052, float:1.8484743E38)
            android.widget.TextView r0 = X.C18310x6.A0L(r9, r0)
            r9.A02 = r0
            r0 = 2131432441(0x7f0b13f9, float:1.848664E38)
            android.widget.ImageView r0 = X.C86654Ky.A0M(r9, r0)
            r9.A01 = r0
            com.whatsapp.mediaview.PhotoView r1 = r9.A76()
            r1.A0Y = r2
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.A08 = r0
            r1.A06(r4)
            android.widget.ImageView r0 = r9.A74()
            r0.setImageBitmap(r4)
            r9.A78()
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "circular_return_name"
            java.lang.String r0 = r1.getStringExtra(r0)
            if (r0 != 0) goto L_0x0149
            android.content.Context r0 = r9.getApplicationContext()
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r0 = r0.getString(r3)
        L_0x0149:
            boolean r12 = X.C107275b2.A00
            r9.A77(r12, r0)
            r0 = 2131433182(0x7f0b16de, float:1.8488142E38)
            android.view.View r6 = r9.findViewById(r0)
            r0 = 2131429057(0x7f0b06c1, float:1.8479776E38)
            android.view.View r7 = r9.findViewById(r0)
            com.whatsapp.mediaview.PhotoView r10 = r9.A0B
            X.C106575Zn.A00(r6, r7, r8, r9, r10, r11, r12)
            X.2j0 r1 = r9.A05
            X.4AQ r0 = r9.A04
            r1.A00(r0)
            return
        L_0x0169:
            X.8JD r7 = new X.8JD
            r7.<init>()
            X.5Tg r4 = r9.A0C
            X.8GA r6 = new X.8GA
            r6.<init>(r9, r7, r4)
            X.2s6 r4 = r9.A07
            boolean r4 = r4.A08(r6)
            if (r4 == 0) goto L_0x00e1
            X.3ZH r6 = r9.A09
            int r4 = r6.A05
            if (r4 <= 0) goto L_0x0195
            X.2ro r4 = r9.A06
            java.io.File r4 = r4.A00(r6)
            if (r4 == 0) goto L_0x0195
            boolean r4 = r4.exists()
            if (r4 != 0) goto L_0x0195
            X.3ZH r4 = r9.A09
            r4.A05 = r5
        L_0x0195:
            X.2s0 r7 = r9.A08
            X.3ZH r4 = r9.A09
            X.4uZ r6 = X.AnonymousClass3ZH.A01(r4)
            X.3ZH r4 = r9.A09
            int r4 = r4.A05
            r7.A01(r6, r4, r2)
            X.3ZH r6 = r9.A09
            int r4 = r6.A05
            if (r4 != 0) goto L_0x00e1
            X.3LP r4 = r9.A0A
            boolean r4 = X.C86624Kv.A1X(r6, r4)
            if (r4 != 0) goto L_0x00e1
            goto L_0x00dc
        L_0x01b4:
            X.4uZ r0 = r6.A0H
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x01c1
            r0 = 2131896250(0x7f1227ba, float:1.9427356E38)
            goto L_0x00aa
        L_0x01c1:
            X.5ZU r1 = r9.A05
            X.3ZH r0 = r9.A09
            java.lang.String r0 = r1.A0H(r0)
            r9.A6e(r0)
            goto L_0x00ad
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.profile.ViewProfilePhoto.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.A09.equals(AnonymousClass4SG.A2c(this)) || this.A09.A0U()) {
            MenuItem add = menu.add(0, R.id.menuitem_edit, 0, R.string.f11nameremoved);
            add.setShowAsAction(2);
            ImageView imageView = (ImageView) C86644Kx.A0F(add, R.layout.f8nameremoved);
            if (imageView != null) {
                imageView.setImageResource(R.drawable.ic_action_edit);
                C634339f.A00(imageView, this, add, 10);
                C18300x5.A13(this, imageView, R.string.f11nameremoved);
                add.setActionView(imageView);
            }
            MenuItem add2 = menu.add(0, 1, 0, R.string.f11nameremoved);
            add2.setShowAsAction(2);
            ImageView imageView2 = (ImageView) C86644Kx.A0F(add2, R.layout.f8nameremoved);
            if (imageView2 != null) {
                imageView2.setImageResource(R.drawable.ic_action_share);
                C634339f.A00(imageView2, this, add2, 11);
                C18300x5.A13(this, imageView2, R.string.f11nameremoved);
                add2.setActionView(imageView2);
            }
        }
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        FileOutputStream A0h;
        MenuItem menuItem2 = menuItem;
        int itemId = menuItem2.getItemId();
        if (itemId == R.id.menuitem_edit) {
            this.A09.A08(this, this.A09, 12, 1, -1, this.A0A, false, false);
            return true;
        } else if (itemId == 1) {
            C64393Dh r3 = this.A04;
            if (this.A09.equals(AnonymousClass4SG.A2c(this))) {
                str = "me.jpg";
            } else {
                str = "photo.jpg";
            }
            File A002 = C64393Dh.A00(r3, str);
            try {
                File A003 = this.A06.A00(this.A09);
                C626936e.A06(A003);
                FileInputStream fileInputStream = new FileInputStream(A003);
                try {
                    A0h = AnonymousClass0x9.A0h(A002);
                    C627536m.A0I(fileInputStream, A0h);
                    Uri A012 = C627536m.A01(this, A002);
                    this.A03.A02().A08(A012.toString());
                    Intent[] intentArr = new Intent[2];
                    intentArr[0] = AnonymousClass0x9.A09("android.intent.action.SEND").setType("image/*").putExtra("android.intent.extra.STREAM", A012);
                    startActivity(C107395bF.A01((IntentSender) null, (CharSequence) null, AnonymousClass0x9.A1A(AnonymousClass0x9.A08(this, SavePhoto.class).putExtra("android.intent.extra.STREAM", Uri.fromFile(A002)).putExtra(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, this.A05.A0H(this.A09)), intentArr, 1)));
                    A0h.close();
                    fileInputStream.close();
                    return true;
                } catch (Throwable th) {
                    fileInputStream.close();
                    throw th;
                }
            } catch (IOException e) {
                Log.e((Throwable) e);
                this.A05.A0H(R.string.f11nameremoved, 1);
                return true;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem2);
        } else {
            AnonymousClass0X0.A00(this);
            return true;
        }
        throw th;
    }

    public ViewProfilePhoto(int i) {
        this.A0B = false;
        C86604Kt.A1K(this, 78);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0C.removeMessages(0);
        this.A01.A07(this.A0E);
        this.A00.A07(this.A0D);
        this.A05.A01(this.A04);
        this.A06.A07(this.A0F);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        if (menu.size() != 0) {
            boolean equals = this.A09.equals(AnonymousClass4SG.A2c(this));
            boolean z = false;
            if (equals || this.A09.A0U()) {
                MenuItem findItem = menu.findItem(1);
                File A002 = this.A06.A00(this.A09);
                C626936e.A06(A002);
                findItem.setVisible(A002.exists());
                MenuItem findItem2 = menu.findItem(R.id.menuitem_edit);
                if ((equals || this.A03.A0D((GroupJid) AnonymousClass3ZH.A05(this.A09, C27991fJ.class)) || !this.A09.A14) && !this.A07.A01(this.A09) && !this.A07.A00(this.A09)) {
                    z = true;
                }
                findItem2.setVisible(z);
            }
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public ViewProfilePhoto() {
        this(0);
        this.A0C = new AnonymousClass4MP(Looper.getMainLooper(), this);
        this.A0A = false;
        this.A0E = AnonymousClass681.A00(this, 35);
        this.A0D = new C189058zv(this, 5);
        this.A0F = new AnonymousClass901(this, 8);
        this.A04 = new C1892290m(this, 1);
    }
}

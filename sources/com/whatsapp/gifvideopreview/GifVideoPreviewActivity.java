package com.whatsapp.gifvideopreview;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0YY;
import X.AnonymousClass0x9;
import X.AnonymousClass1WH;
import X.AnonymousClass2LJ;
import X.AnonymousClass2OC;
import X.AnonymousClass30M;
import X.AnonymousClass33C;
import X.AnonymousClass4FV;
import X.AnonymousClass4SG;
import X.AnonymousClass4SQ;
import X.C005205m;
import X.C102855Kn;
import X.C103215Lz;
import X.C106095Xp;
import X.C107085af;
import X.C107695bk;
import X.C114335ms;
import X.C135166kE;
import X.C162937t0;
import X.C18290x4;
import X.C18300x5;
import X.C18320x8;
import X.C33141sV;
import X.C33151sW;
import X.C54722pB;
import X.C55972rD;
import X.C56042rK;
import X.C56612sH;
import X.C621033m;
import X.C624134x;
import X.C626936e;
import X.C627336j;
import X.C64333Db;
import X.C72343dZ;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86644Kx;
import X.C86664Kz;
import X.C88834as;
import X.C89134bh;
import X.C95204sn;
import X.C95384tZ;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.videoplayback.VideoSurfaceView;
import java.io.File;
import java.util.List;

public class GifVideoPreviewActivity extends C89134bh {
    public int A00;
    public View A01;
    public C621033m A02;
    public AnonymousClass4FV A03;
    public C106095Xp A04;
    public C55972rD A05;
    public AnonymousClass2LJ A06;
    public VideoSurfaceView A07;
    public boolean A08;

    public void A5r() {
        if (!this.A08) {
            this.A08 = true;
            C88834as A2W = AnonymousClass4SG.A2W(this);
            C64333Db r1 = A2W.A4Z;
            AnonymousClass4SG.A3W(r1, this);
            C107695bk r2 = r1.A00;
            AnonymousClass4SG.A3Q(r1, r2, this, AnonymousClass4SG.A2t(r1, r2, this));
            this.A08 = C64333Db.A39(r1);
            this.A0A = C86634Kw.A0h(r1);
            this.A0C = C86604Kt.A0X(r1);
            this.A0B = C107695bk.A1m(r2);
            this.A0L = C86634Kw.A0s(r1);
            this.A05 = C64333Db.A26(r1);
            this.A06 = C64333Db.A28(r1);
            this.A0K = (C56042rK) r1.AEv.get();
            this.A0J = C86614Ku.A0m(r1);
            this.A0D = C107695bk.A1n(r2);
            this.A0G = C64333Db.A74(r1);
            this.A0H = C107695bk.A5D(r2);
            this.A0M = C72343dZ.A00(r1.A7Q);
            this.A04 = (C103215Lz) A2W.A11.get();
            this.A07 = C107695bk.A15(r2);
            this.A04 = C86644Kx.A0V(r1);
            this.A03 = C64333Db.A4H(r1);
            this.A02 = C64333Db.A08(r1);
            this.A05 = (C55972rD) r1.AJk.get();
            this.A06 = new AnonymousClass2LJ((C56612sH) r1.ASO.get(), (AnonymousClass4FV) r1.ASY.get());
        }
    }

    public boolean A64() {
        return true;
    }

    public void A76(File file, boolean z) {
        String path;
        Uri parse;
        byte[] bArr;
        AnonymousClass2OC B3u;
        File file2 = this.A0N;
        if (file2 == null) {
            path = null;
        } else {
            path = file2.getPath();
        }
        if (this.A0P.size() == 0) {
            A77(false);
            return;
        }
        VideoSurfaceView videoSurfaceView = this.A07;
        MediaPlayer mediaPlayer = videoSurfaceView.A0C;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            videoSurfaceView.A0C.release();
            videoSurfaceView.A0C = null;
            videoSurfaceView.A02 = 0;
        }
        if (z) {
            AnonymousClass33C r10 = new AnonymousClass33C();
            byte[] bArr2 = null;
            if (path != null) {
                File A0B = AnonymousClass002.A0B(path);
                r10.A0F = A0B;
                bArr = C107085af.A04(A0B);
                parse = null;
            } else {
                parse = Uri.parse(getIntent().getStringExtra("media_url"));
                r10.A08 = getIntent().getIntExtra("media_width", -1);
                r10.A06 = getIntent().getIntExtra("media_height", -1);
                String stringExtra = getIntent().getStringExtra("preview_media_url");
                if (!(stringExtra == null || (B3u = C106095Xp.A00(this.A04).B3u(stringExtra)) == null)) {
                    bArr2 = B3u.A02;
                }
                bArr = bArr2;
            }
            r10.A05 = this.A00;
            AnonymousClass30M A002 = this.A05.A00(parse, r10, this.A09, (C624134x) null, this.A0I.A06.getStringText(), this.A0P, this.A0I.A06.getMentions(), (List) null, (byte) 13, 0, 0, getIntent().getBooleanExtra("number_from_url", false));
            A002.A00 = 1;
            this.A02.A08(A002, bArr, this.A0Q, !this.A0O.equals(this.A0P));
            if (r10.A05 != 0) {
                AnonymousClass1WH r1 = new AnonymousClass1WH();
                int i = r10.A05;
                int i2 = 0;
                if (i != 1) {
                    if (i == 2) {
                        i2 = 1;
                    } else {
                        throw AnonymousClass000.A0G("Unexpected provider type ", AnonymousClass001.A0o(), i);
                    }
                }
                r1.A00 = Integer.valueOf(i2);
                this.A03.BhD(r1);
            }
            if (this.A0P.size() > 1 || (this.A0P.size() == 1 && (this.A0P.get(0) instanceof C135166kE))) {
                Bqv(this.A0P);
            }
            setResult(-1);
        } else {
            Intent A072 = C18320x8.A07();
            A072.putExtra("file_path", path);
            A072.putExtra("jids", C627336j.A0A(this.A0P));
            this.A0H.A01(A072, this.A09);
            A072.putExtra("audience_clicked", this.A0Q);
            A072.putExtra("audience_updated", !this.A0O.equals(this.A0P));
            if (path == null) {
                A072.putExtra("media_url", getIntent().getStringExtra("media_url"));
                A072.putExtra("media_width", getIntent().getIntExtra("media_width", -1));
                A072.putExtra("media_height", getIntent().getIntExtra("media_height", -1));
                A072.putExtra("preview_media_url", getIntent().getStringExtra("preview_media_url"));
            }
            A072.putExtra("provider", getIntent().getIntExtra("provider", 0));
            A072.putExtra("caption", this.A0I.A06.getStringText());
            A072.putExtra("mentions", AnonymousClass4SQ.A00(this.A0I.A06));
            A072.putExtra("clear_message_after_send", getIntent().getBooleanExtra("clear_message_after_send", false));
            setResult(-1, A072);
        }
        int intExtra = getIntent().getIntExtra("origin", 23);
        boolean contains = this.A0P.contains(C135166kE.A00);
        int A042 = AnonymousClass002.A04(this.A0P, contains ? 1 : 0);
        AnonymousClass2LJ r6 = this.A06;
        boolean z2 = this.A0Q;
        boolean z3 = !this.A0O.equals(this.A0P);
        C95204sn r12 = new C95204sn();
        r12.A05 = 11;
        r12.A04 = Integer.valueOf(intExtra);
        r12.A0N = AnonymousClass0x9.A0m(contains);
        r12.A08 = AnonymousClass0x9.A0m(A042);
        Long A0m = AnonymousClass0x9.A0m(1);
        r12.A0E = A0m;
        r12.A0F = A0m;
        Long A0m2 = AnonymousClass0x9.A0m(0);
        r12.A09 = A0m2;
        r12.A0B = A0m2;
        r12.A0A = A0m2;
        r12.A0C = A0m2;
        r12.A0G = A0m2;
        r12.A0I = A0m2;
        r12.A03 = false;
        r12.A02 = false;
        r12.A00 = Boolean.valueOf(z2);
        r12.A01 = Boolean.valueOf(z3);
        r6.A01.BhB(r12);
        finish();
    }

    public void BW6(File file, String str) {
        String path;
        AnonymousClass2OC B3u;
        byte[] bArr;
        super.BW6(file, str);
        if (!isFinishing()) {
            File file2 = this.A0N;
            if (file2 == null) {
                path = null;
            } else {
                path = file2.getPath();
            }
            if (TextUtils.isEmpty(path)) {
                String stringExtra = getIntent().getStringExtra("preview_media_url");
                if (stringExtra == null || (B3u = C106095Xp.A00(this.A04).B3u(stringExtra)) == null || (bArr = B3u.A02) == null) {
                    this.A04.A03(this.A03, getIntent().getStringExtra("static_preview_url"));
                } else {
                    this.A03.setImageBitmap(BitmapFactory.decodeByteArray(bArr, 0, bArr.length, C33141sV.A08));
                }
                C106095Xp r2 = this.A04;
                String stringExtra2 = getIntent().getStringExtra("media_url");
                C114335ms r12 = new C114335ms(this);
                C626936e.A01();
                C33151sW A012 = r2.A01();
                AnonymousClass2OC B3u2 = A012.B3u(stringExtra2);
                if (B3u2 != null) {
                    String str2 = B3u2.A00;
                    if (AnonymousClass002.A0B(str2).exists() && B3u2.A02 != null) {
                        r12.BTT(AnonymousClass002.A0B(str2), stringExtra2, B3u2.A02);
                    }
                }
                C56612sH r10 = r2.A0B;
                new C95384tZ(r2.A03, r2.A05, r2.A07, r2.A08, r2.A09, r2.A0A, r10, A012, r12, stringExtra2).A02.executeOnExecutor(r2.A02(), new Void[0]);
                return;
            }
            this.A07.setVideoPath(path);
            this.A07.start();
            this.A01.setVisibility(8);
        }
    }

    public GifVideoPreviewActivity(int i) {
        this.A08 = false;
        C86604Kt.A1K(this, 41);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        ImageView A0u = C86664Kz.A0u(this, R.id.view_once_toggle);
        View A002 = C005205m.A00(this, R.id.view_once_toggle_spacer);
        if (this.A0D.A0X(2832)) {
            C18290x4.A1A(this, A0u, R.drawable.view_once_selector_v2);
        } else {
            C18290x4.A1A(this, A0u, R.drawable.view_once_selector);
            C86644Kx.A0l(this, A0u, R.color.f5nameremoved);
        }
        A0u.setEnabled(false);
        C86624Kv.A13(A0u, A002);
        View view = new View(this);
        this.A01 = view;
        view.setId(R.id.gif_preview_shutter);
        C86604Kt.A0z(this, this.A01, R.color.f5nameremoved);
        C18300x5.A13(this, this.A01, R.string.f11nameremoved);
        this.A01.setLayoutParams(C86664Kz.A0q());
        this.A02.addView(this.A01, 0);
        VideoSurfaceView videoSurfaceView = new VideoSurfaceView(this);
        this.A07 = videoSurfaceView;
        videoSurfaceView.setId(R.id.gif_preview_video);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        layoutParams.setMargins(0, 0, 0, getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
        this.A07.setLayoutParams(layoutParams);
        VideoSurfaceView videoSurfaceView2 = this.A07;
        videoSurfaceView2.A0B = new C162937t0();
        this.A02.addView(videoSurfaceView2, 0);
        int intExtra = getIntent().getIntExtra("provider", 0);
        int i = 1;
        if (intExtra != 1) {
            i = 2;
            if (intExtra != 2) {
                i = 0;
            }
        }
        this.A00 = i;
        AnonymousClass0YY.A06(this.A07, 2);
        AnonymousClass4SG.A3d(this);
    }

    public void onDestroy() {
        super.onDestroy();
        C102855Kn r2 = this.A0I;
        if (r2 != null) {
            r2.A00.getViewTreeObserver().removeGlobalOnLayoutListener(r2.A01);
            r2.A06.A0C();
            r2.A03.dismiss();
            this.A0I = null;
        }
        C106095Xp r1 = this.A04;
        C54722pB r0 = r1.A01;
        if (r0 != null) {
            r0.A00();
            r1.A01 = null;
        }
    }

    public void onStop() {
        super.onStop();
        this.A07.A00();
    }

    public int A5t() {
        return 78318969;
    }

    public GifVideoPreviewActivity() {
        this(0);
    }
}

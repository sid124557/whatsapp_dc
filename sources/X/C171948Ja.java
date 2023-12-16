package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.Looper;
import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceConfiguration;
import com.facebook.soloader.SoLoader;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.8Ja  reason: invalid class name and case insensitive filesystem */
public final class C171948Ja implements C186168ur {
    public SurfaceTexture A00;
    public ImageReader.OnImageAvailableListener A01;
    public Handler A02;
    public C1680483x A03;
    public C194949Ve A04;
    public final Context A05;
    public final C195649Yz A06;
    public final C157207hv A07;
    public final C1680383w A08;
    public final AnonymousClass7U1 A09;
    public final C1680083t A0A;
    public final C45102Yr A0B;

    public void BmC(AnonymousClass646 r19, C106005Xg r20) {
        HashMap hashMap;
        String str;
        Object obj;
        C203649o5 r10 = (C203649o5) this.A06.B5j(C203649o5.A01);
        C106005Xg r11 = r20;
        if (r20 != null) {
            C194509Te A002 = r11.A00();
            if (A002.A03() != null) {
                AnonymousClass646 r0 = r19;
                C156147g6 r9 = new C156147g6(this, r0);
                AnonymousClass7IN r8 = new AnonymousClass7IN(this, r0);
                SoLoader.A07("dynamic_pytorch_impl", 16);
                SoLoader.A07("torch-code-gen", 16);
                Context context = this.A05;
                C45102Yr r6 = this.A0B;
                C162457s7.A0J(r10, 1);
                String A032 = A002.A03();
                if (A032 != null) {
                    AnonymousClass9SI A003 = A002.A00();
                    ModelPathsHolder A004 = A003.A00(VersionedCapability.Facetracker);
                    ModelPathsHolder A005 = A003.A00(VersionedCapability.FaceExpressionFitting);
                    AnonymousClass9QT A012 = A002.A01();
                    AnonymousClass9Yq r4 = new AnonymousClass9Yq();
                    C160587nv r3 = new C160587nv();
                    r3.A05 = A032;
                    if (A004 == null) {
                        hashMap = AnonymousClass001.A0t();
                    } else {
                        String modelPath = A004.getModelPath(C192479Jx.A04);
                        String modelPath2 = A004.getModelPath(C192479Jx.A02);
                        String modelPath3 = A004.getModelPath(C192479Jx.A03);
                        String modelPath4 = A004.getModelPath(C192479Jx.A05);
                        HashMap A0t = AnonymousClass001.A0t();
                        String[] strArr = AnonymousClass76V.A00;
                        A0t.put(strArr[0], modelPath);
                        A0t.put(strArr[1], modelPath2);
                        A0t.put(strArr[2], modelPath3);
                        A0t.put(strArr[3], modelPath4);
                        hashMap = new HashMap(A0t);
                    }
                    r3.A0B = hashMap;
                    if (A005 != null) {
                        r3.A07 = A005.getModelPath(C192479Jx.A01);
                    }
                    AnonymousClass9VR A006 = AnonymousClass9V9.A00(context);
                    A006.A01(AnonymousClass96I.A01, new AnonymousClass96I(r4));
                    A006.A01(AnonymousClass96F.A01, new AnonymousClass96F());
                    A006.A01(GalleryPickerServiceConfiguration.A00, new GalleryPickerServiceConfiguration());
                    AnonymousClass9U7 r12 = AnonymousClass96G.A04;
                    C166557yt r02 = r11.A02;
                    String str2 = null;
                    if (r02 == null || (obj = r02.A00) == null) {
                        str = null;
                    } else {
                        str = String.valueOf(obj);
                    }
                    C166557yt r03 = r11.A01;
                    if (r03 != null) {
                        str2 = (String) r03.A00;
                    }
                    A006.A01(r12, new AnonymousClass96G(C192409Jp.WhatsApp, r8, str, str2));
                    AnonymousClass9SK r04 = new AnonymousClass9SK();
                    r04.A01();
                    A006.A02(r04.A00());
                    r3.A00 = A006.A00();
                    String str3 = r11.A03;
                    if (str3.isEmpty()) {
                        str3 = "0";
                    }
                    r3.A08 = str3;
                    r3.A09 = r11.A04;
                    r3.A0A = r11.A05;
                    r3.A02 = SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME;
                    r3.A03 = r11.A06;
                    r3.A04 = A002.A02();
                    r3.A06 = A002.A04();
                    r3.A01 = C192439Jt.USER_INTERACTION;
                    r3.A0C = A012.A00();
                    AnonymousClass85S r5 = new AnonymousClass85S(new AnonymousClass7XK(r3), r9);
                    AnonymousClass8X9 r2 = new AnonymousClass8X9(r10, r5);
                    Looper myLooper = Looper.myLooper();
                    if (myLooper == null) {
                        Log.e("SparkRetryHandler/onSetEffect Looper for camera thread is null");
                    } else {
                        synchronized (r6) {
                            r6.A00();
                            C70143a1 r32 = new C70143a1(r2, 47, r6);
                            Handler handler = new Handler(myLooper);
                            handler.postDelayed(r32, 5000);
                            r6.A00 = handler;
                            r6.A01 = r32;
                        }
                    }
                    r10.BZu(r5);
                    r4.Blv(AnonymousClass20J.FRONT);
                    return;
                }
                throw AnonymousClass001.A0e("Required value was null.");
            }
        }
        C45102Yr r22 = this.A0B;
        C162457s7.A0J(r10, 0);
        AnonymousClass85S r1 = new AnonymousClass85S((AnonymousClass7XK) null, (C156147g6) null);
        Log.d("SparkRetryHandler/onUnsetEffect Effect unset, cleaning up");
        r22.A00();
        r10.BZu(r1);
    }

    public void BmP(ImageReader.OnImageAvailableListener onImageAvailableListener, Handler handler) {
        this.A01 = onImageAvailableListener;
        this.A02 = handler;
        ImageReader B8G = ((C187538xN) this.A06.B5j(C187538xN.A00)).B8G();
        if (B8G != null) {
            Image acquireLatestImage = B8G.acquireLatestImage();
            if (acquireLatestImage != null) {
                acquireLatestImage.close();
            }
            B8G.setOnImageAvailableListener(new AnonymousClass90K(this, 1), this.A02);
        }
    }

    public void Brq(C152697Zy r20) {
        if (this.A03 != null) {
            C1680383w r10 = this.A08;
            C152697Zy r6 = r20;
            AnonymousClass66R r3 = r6.A08;
            int A092 = AnonymousClass0x2.A09(r3);
            AnonymousClass66R r2 = r6.A04;
            int A093 = AnonymousClass0x2.A09(r2);
            int A094 = AnonymousClass0x2.A09(r3);
            int A095 = AnonymousClass0x2.A09(r2);
            int A096 = AnonymousClass0x2.A09(r6.A05);
            boolean z = r6.A09;
            r10.A01 = A092;
            r10.A00 = A093;
            AnonymousClass7Ow r4 = r10.A02;
            C151837Wm r0 = r4.A04;
            if (r0 != null) {
                r0.A01(A092, A093);
            }
            C162017r3 r8 = r10.A04;
            r8.A03(r10.A01, r10.A00, A094, A095, 0, false, false);
            r4.A02 = 0;
            r4.A01 = A096;
            r4.A00 = 0;
            r4.A06 = z;
            r8.A02();
            C194949Ve r42 = this.A04;
            if (r42 != null) {
                r42.A05(AnonymousClass0x2.A09(r6.A06));
            }
            C195649Yz r5 = this.A06;
            ((C187538xN) r5.B5j(C187538xN.A00)).BnH(AnonymousClass0x2.A09(r6.A06));
            ((C203659o6) r5.B5j(C203659o6.A00)).Brt(0, AnonymousClass0x2.A09(r3), AnonymousClass0x2.A09(r2), AnonymousClass0x2.A09(r3), AnonymousClass0x2.A09(r2), z);
        }
    }

    public void start() {
        C195649Yz r1 = this.A06;
        r1.Bk9();
        ((C203659o6) r1.B5j(C203659o6.A00)).B9U().BmR(this.A0A, 0);
    }

    public C171948Ja(Context context, C195649Yz r6, C45102Yr r7) {
        this.A05 = context;
        this.A06 = r6;
        this.A0B = r7;
        C157207hv r3 = new C157207hv();
        this.A07 = r3;
        AnonymousClass7U1 r2 = new AnonymousClass7U1();
        this.A09 = r2;
        r2.A05 = new AnonymousClass7EZ(this);
        C1680383w r1 = new C1680383w(r2, new C126196Mv());
        this.A08 = r1;
        this.A0A = new C1680083t(r3, r1);
        start();
    }
}

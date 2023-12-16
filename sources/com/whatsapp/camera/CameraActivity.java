package com.whatsapp.camera;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass30B;
import X.AnonymousClass30V;
import X.AnonymousClass3DP;
import X.AnonymousClass4BC;
import X.AnonymousClass4NB;
import X.AnonymousClass4X4;
import X.AnonymousClass5OK;
import X.AnonymousClass5PF;
import X.AnonymousClass5TA;
import X.AnonymousClass5U6;
import X.AnonymousClass5UD;
import X.AnonymousClass5UR;
import X.AnonymousClass5Y6;
import X.AnonymousClass5ZC;
import X.AnonymousClass5ZM;
import X.AnonymousClass5ZR;
import X.AnonymousClass5ZS;
import X.C06560Yg;
import X.C08310eF;
import X.C102985La;
import X.C104405Qv;
import X.C106105Xq;
import X.C107275b2;
import X.C114185md;
import X.C114195me;
import X.C162457s7;
import X.C165877xm;
import X.C179198il;
import X.C183538qC;
import X.C186308v5;
import X.C188018yB;
import X.C49632gq;
import X.C50022hV;
import X.C52412lR;
import X.C53492nB;
import X.C54292oU;
import X.C58152un;
import X.C620633i;
import X.C72303dV;
import X.C73723fy;
import X.C73783g4;
import X.C86604Kt;
import X.C86654Ky;
import X.C89474d2;
import X.C94824ry;
import X.C95814uZ;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.R;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CameraActivity extends C89474d2 implements AnonymousClass4BC, C179198il {
    public C08310eF A00;
    public AnonymousClass3DP A01;
    public AnonymousClass30B A02;
    public AnonymousClass5ZS A03;
    public C102985La A04;
    public AnonymousClass5U6 A05;
    public AnonymousClass5ZR A06;
    public C72303dV A07;
    public C52412lR A08;
    public C50022hV A09;
    public WhatsAppLibLoader A0A;
    public C49632gq A0B;
    public AnonymousClass5PF A0C;
    public AnonymousClass30V A0D;
    public C183538qC A0E;
    public final Rect A0F = AnonymousClass001.A0N();

    public boolean A6C() {
        return true;
    }

    public AnonymousClass5ZC BCP() {
        return C58152un.A02;
    }

    public void BZD() {
        this.A03.A0u.A0e = false;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 30) {
            if (i != 90) {
                super.onActivityResult(i, i2, intent);
            } else {
                this.A03.A0H(i, i2, intent);
            }
        } else if (i2 == -1) {
            this.A03.A07();
        } else {
            finish();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e9, code lost:
        if (r7 == 0) goto L_0x00eb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBackPressed() {
        /*
            r11 = this;
            X.5ZS r2 = r11.A03
            X.4ea r0 = r2.A0A
            if (r0 == 0) goto L_0x011d
            r4 = 0
            boolean r0 = r2.A0Q()
            if (r0 == 0) goto L_0x0017
            X.5TA r0 = r2.A0I
            boolean r0 = r0.A02()
            r2.A0P(r0)
        L_0x0016:
            return
        L_0x0017:
            X.5UD r0 = r2.A0F
            if (r0 == 0) goto L_0x0090
            com.whatsapp.camera.CameraBottomSheetBehavior r3 = r0.A0B
            int r1 = r3.A0O
            r0 = 3
            if (r1 != r0) goto L_0x0062
            r0 = 4
            r3.A0S(r0)
            X.5Xf r3 = r2.A0j
            X.5Qv r0 = r2.A0i
            java.util.Set r0 = r0.A0A
            boolean r0 = r0.isEmpty()
            r2 = r0 ^ 1
            boolean r0 = r3.A04()
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = "CameraCaptureFlowLogger/logGalleryBrowserCancelled"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.4sj r1 = new X.4sj
            r1.<init>()
            X.2M9 r0 = r3.A02
            java.lang.Long r0 = r0.A00
            r1.A0G = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A01 = r0
            java.lang.Integer r0 = X.C18290x4.A0c()
            r1.A09 = r0
            int r0 = X.C18280x3.A00(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0B = r0
            X.4FV r0 = r3.A01
            r0.BhA(r1)
            return
        L_0x0062:
            X.5Qv r1 = r2.A0i
            java.util.Set r3 = r1.A0A
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0090
            r3.clear()
            X.5Xq r0 = new X.5Xq
            r0.<init>()
            r1.A03 = r0
            java.util.List r0 = r1.A09
            r0.clear()
            X.5Y6 r1 = r2.A0E
            int r0 = r3.size()
            r1.A07(r4, r0)
            X.5UD r0 = r2.A0F
            X.4X4 r0 = r0.A04
            if (r0 == 0) goto L_0x0016
            r0.A05()
            return
        L_0x0090:
            X.5Qv r0 = r2.A0i
            r0.A00()
            X.AnonymousClass5ZS.A01(r2)
            X.5Xf r3 = r2.A0j
            X.678 r0 = r2.A0C
            boolean r10 = r0.BHe()
            int r7 = r0.getZoomLevel()
            X.678 r0 = r2.A0C
            java.lang.String r9 = r0.getFlashMode()
            X.2oU r0 = r2.A0o
            android.content.Context r0 = r0.A00
            int r0 = X.C86604Kt.A02(r0)
            r5 = 2
            boolean r8 = X.AnonymousClass000.A1U(r0, r5)
            X.8sw r0 = r2.A11
            int r4 = r0.BAC()
            boolean r0 = r3.A04()
            if (r0 == 0) goto L_0x011d
            java.lang.String r0 = "CameraCaptureFlowLogger/logCaptureCancelled"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.4sj r2 = new X.4sj
            r2.<init>()
            java.lang.Integer r0 = X.C18290x4.A0d()
            r2.A09 = r0
            X.2M9 r1 = r3.A02
            java.lang.Long r0 = r1.A00
            r2.A0G = r0
            r6 = 2
            int r0 = X.C18280x3.A01(r10)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A07 = r0
            r0 = 100
            if (r7 == r0) goto L_0x00eb
            r0 = 1
            if (r7 != 0) goto L_0x00ec
        L_0x00eb:
            r0 = 0
        L_0x00ec:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A05 = r0
            int r0 = X.C105995Xf.A00(r9)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0A = r0
            if (r8 == 0) goto L_0x00ff
            r6 = 1
        L_0x00ff:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r2.A0D = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.A04 = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.A00 = r0
            r0 = 1
            if (r4 == r0) goto L_0x0115
            if (r4 == r5) goto L_0x0115
            r0 = 3
            if (r4 != r0) goto L_0x0118
        L_0x0115:
            r0 = 0
            r1.A00 = r0
        L_0x0118:
            X.4FV r0 = r3.A01
            r0.BhA(r2)
        L_0x011d:
            super.onBackPressed()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.CameraActivity.onBackPressed():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if (r0 == null) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x022e, code lost:
        if (r0 != false) goto L_0x0230;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r43) {
        /*
            r42 = this;
            r7 = r42
            r6 = r43
            super.onCreate(r6)
            X.8Fi r12 = new X.8Fi
            r12.<init>(r7)
            if (r43 == 0) goto L_0x001c
            X.0df r1 = r7.getSupportFragmentManager()
            java.lang.String r0 = "media_picker_fragment_tag"
            X.0eF r0 = r1.A0C(r6, r0)
            r7.A00 = r0
            if (r0 != 0) goto L_0x0026
        L_0x001c:
            X.8qC r0 = r7.A0E
            java.lang.Object r0 = r0.get()
            X.0eF r0 = (X.C08310eF) r0
            r7.A00 = r0
        L_0x0026:
            X.5PF r2 = r7.A0C
            X.1VX r1 = r7.A0D
            r0 = 611(0x263, float:8.56E-43)
            boolean r1 = r1.A0X(r0)
            X.3Mh r0 = r7.A06
            X.1Ei r4 = X.C66663Mh.A0p
            boolean r0 = r0.A08(r4)
            r13 = 0
            X.33I r37 = r2.A00(r7, r1, r0)
            X.5La r11 = r7.A04
            X.0eF r0 = r7.A00
            r41 = r0
            X.2oU r0 = r11.A0C
            r31 = r0
            X.2sH r0 = r11.A0B
            r30 = r0
            X.30B r0 = r11.A03
            r24 = r0
            X.1VX r0 = r11.A0G
            r23 = r0
            X.3Wi r0 = r11.A01
            r22 = r0
            X.4FS r0 = r11.A0J
            r20 = r0
            X.3Dh r0 = r11.A00
            r19 = r0
            X.5O9 r0 = r11.A0H
            r18 = r0
            X.4xc r0 = r11.A0K
            r17 = r0
            X.5TW r0 = r11.A04
            r21 = r0
            X.33i r0 = r11.A0A
            r16 = r0
            X.33j r15 = r11.A0E
            X.54I r14 = r11.A02
            X.5Qv r10 = r11.A06
            X.33p r9 = r11.A0D
            X.5Xf r8 = r11.A07
            X.5UM r5 = r11.A08
            X.5O5 r3 = r11.A05
            X.2y5 r2 = r11.A0I
            X.5U6 r1 = r11.A09
            X.2lR r0 = r11.A0F
            boolean r40 = r0.A02()
            X.5ZS r0 = new X.5ZS
            r25 = r11
            r26 = r8
            r27 = r5
            r28 = r1
            r29 = r16
            r32 = r9
            r33 = r15
            r34 = r23
            r35 = r18
            r36 = r2
            r38 = r20
            r39 = r17
            r15 = r0
            r16 = r41
            r17 = r19
            r18 = r22
            r19 = r14
            r20 = r24
            r22 = r12
            r23 = r3
            r24 = r10
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r7.A03 = r0
            r0 = 2131895730(0x7f1225b2, float:1.9426301E38)
            r7.setTitle(r0)
            com.whatsapp.Me r0 = X.AnonymousClass4SG.A2b(r7)
            if (r0 == 0) goto L_0x0124
            X.3dV r0 = r7.A07
            r0.A05()
            boolean r0 = r0.A09
            if (r0 == 0) goto L_0x0124
            X.2jE r0 = r7.A09
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0124
            com.whatsapp.nativelibloader.WhatsAppLibLoader r0 = r7.A0A
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x00e5
            java.lang.String r0 = "aborting due to native libraries missing"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00e1:
            r7.finish()
        L_0x00e4:
            return
        L_0x00e5:
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r1 = r0.getAction()
            java.lang.String r0 = "android.intent.action.CREATE_SHORTCUT"
            boolean r0 = r0.equals(r1)
            r3 = -1
            if (r0 == 0) goto L_0x0108
            X.3DP r0 = r7.A01
            X.2oU r0 = r0.A0A
            android.content.Context r1 = r0.A00
            X.0U1 r0 = X.AnonymousClass3DP.A00(r1)
            android.content.Intent r0 = X.AnonymousClass0YP.A01(r1, r0)
            r7.setResult(r3, r0)
            goto L_0x00e1
        L_0x0108:
            X.2zf r0 = r7.A07
            long r10 = r0.A02()
            X.1VX r1 = r7.A0D
            r0 = 3658(0xe4a, float:5.126E-42)
            long r8 = X.C86624Kv.A05(r1, r0)
            r2 = 1
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x012e
            X.3Wi r1 = r7.A05
            r0 = 2131889102(0x7f120bce, float:1.9412858E38)
            r1.A0F(r0, r2)
            goto L_0x00e1
        L_0x0124:
            java.lang.String r0 = "cameraactivity/create/no-me-or-msgstore-db"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.Intent r3 = X.C627736r.A03(r7)
            goto L_0x0157
        L_0x012e:
            android.content.Intent r0 = r7.getIntent()
            int r1 = r0.getFlags()
            r0 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x015b
            java.lang.String r0 = "cameraactivity/create/restart-old-shortcut"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.Intent r3 = X.C18320x8.A07()
            java.lang.String r1 = r7.getPackageName()
            java.lang.String r0 = "com.whatsapp.camera.LauncherCameraActivity"
            r3.setClassName(r1, r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r3.addFlags(r0)
            java.lang.String r0 = "camera_origin"
            r3.putExtra(r0, r2)
        L_0x0157:
            r7.startActivity(r3)
            goto L_0x00e1
        L_0x015b:
            android.view.Window r1 = r7.getWindow()
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            X.C86644Kx.A17(r1, r0)
            android.view.Window r0 = r7.getWindow()
            X.C111095hX.A08(r0)
            r0 = 2131624014(0x7f0e004e, float:1.8875196E38)
            r7.setContentView((int) r0)
            r0 = 2131428496(0x7f0b0490, float:1.8478638E38)
            android.view.View r14 = r7.findViewById(r0)
            android.view.Window r1 = r7.getWindow()
            r0 = 1024(0x400, float:1.435E-42)
            r1.addFlags(r0)
            r14.setSystemUiVisibility(r0)
            android.content.Intent r0 = r7.getIntent()
            if (r0 == 0) goto L_0x0274
            android.os.Bundle r0 = X.C86614Ku.A0D(r7)
            if (r0 == 0) goto L_0x0274
            android.os.Bundle r1 = X.C86614Ku.A0D(r7)
            java.lang.String r0 = "media_preview_params"
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x0274
            X.5Xq r18 = new X.5Xq
            r18.<init>()
            android.os.Bundle r1 = X.C86614Ku.A0D(r7)
            r0 = r18
            r0.A02(r1)
        L_0x01aa:
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r0 = "jids"
            java.util.ArrayList r1 = r1.getStringArrayListExtra(r0)
            if (r1 == 0) goto L_0x0262
            java.lang.Class<X.4uZ> r0 = X.C95814uZ.class
            java.util.List r9 = X.C627336j.A0B(r0, r1)
        L_0x01bc:
            X.2lR r0 = r7.A08
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x025d
            r7.setRequestedOrientation(r3)
            android.view.Window r1 = r7.getWindow()
            android.view.WindowManager$LayoutParams r0 = r1.getAttributes()
            r0.rotationAnimation = r2
            r1.setAttributes(r0)
        L_0x01d4:
            X.5ZS r8 = r7.A03
            android.view.ViewGroup r14 = (android.view.ViewGroup) r14
            android.content.Intent r3 = r7.getIntent()
            java.lang.String r2 = "quoted_message_row_id"
            r0 = 0
            long r2 = r3.getLongExtra(r2, r0)
            X.1fJ r12 = X.C86604Kt.A0c(r7)
            android.content.Intent r5 = r7.getIntent()
            java.lang.String r0 = "chat_opened_from_url"
            r1 = 0
            boolean r11 = r5.getBooleanExtra(r0, r1)
            android.content.Intent r5 = r7.getIntent()
            java.lang.String r0 = "android.intent.extra.TEXT"
            java.lang.String r10 = r5.getStringExtra(r0)
            android.content.Intent r5 = r7.getIntent()
            java.lang.String r0 = "mentions"
            java.lang.String r0 = r5.getStringExtra(r0)
            java.util.List r5 = X.C624435a.A03(r0)
            if (r43 != 0) goto L_0x0258
            android.content.Intent r15 = r7.getIntent()
            java.lang.String r0 = "uris"
            java.util.ArrayList r17 = r15.getParcelableArrayListExtra(r0)
        L_0x0217:
            android.content.Intent r15 = r7.getIntent()
            java.lang.String r0 = "enable_qr_scan"
            boolean r0 = r15.getBooleanExtra(r0, r1)
            if (r0 != 0) goto L_0x0230
            boolean r0 = r7 instanceof com.whatsapp.camera.LauncherCameraActivity
            if (r0 == 0) goto L_0x0256
            X.3Mh r0 = r7.A06
            boolean r0 = r0.A08(r4)
        L_0x022d:
            r4 = 0
            if (r0 == 0) goto L_0x0231
        L_0x0230:
            r4 = 1
        L_0x0231:
            android.content.Intent r15 = r7.getIntent()
            java.lang.String r0 = "add_more_image"
            boolean r16 = r15.getBooleanExtra(r0, r1)
            if (r43 != 0) goto L_0x0247
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r0 = "selected_uris"
            java.util.ArrayList r13 = r1.getParcelableArrayListExtra(r0)
        L_0x0247:
            r15 = r9
            if (r14 == 0) goto L_0x0278
            android.view.LayoutInflater r6 = r7.getLayoutInflater()
            r1 = 2131624309(0x7f0e0175, float:1.8875794E38)
            r0 = 1
            r6.inflate(r1, r14, r0)
            goto L_0x0278
        L_0x0256:
            r0 = 0
            goto L_0x022d
        L_0x0258:
            r17 = r13
            r18 = r13
            goto L_0x0217
        L_0x025d:
            r7.setRequestedOrientation(r2)
            goto L_0x01d4
        L_0x0262:
            X.4uZ r0 = X.C106405Yw.A00(r7)
            if (r0 != 0) goto L_0x026e
            java.util.List r9 = java.util.Collections.emptyList()
            goto L_0x01bc
        L_0x026e:
            java.util.List r9 = java.util.Collections.singletonList(r0)
            goto L_0x01bc
        L_0x0274:
            r18 = r13
            goto L_0x01aa
        L_0x0278:
            X.5UM r6 = r8.A0k     // Catch:{ all -> 0x0648 }
            X.8sw r0 = r8.A11     // Catch:{ all -> 0x0648 }
            int r0 = r0.BAC()     // Catch:{ all -> 0x0648 }
            java.lang.String r1 = X.C154277cu.A01(r0)     // Catch:{ all -> 0x0648 }
            java.lang.String r0 = "cold"
            r6.A04(r0, r1)     // Catch:{ all -> 0x0648 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0648 }
            r6.A01 = r0     // Catch:{ all -> 0x0648 }
            r0 = 554251647(0x2109357f, float:4.6488207E-19)
            java.lang.String r14 = "onCreate"
            r6.A02(r0, r14)     // Catch:{ all -> 0x0648 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0648 }
            java.lang.String r0 = "camera/onCreateInternal instance = "
            X.C18260x0.A1P(r1, r0, r8)     // Catch:{ all -> 0x0648 }
            r8.A0A = r7     // Catch:{ all -> 0x0648 }
            if (r9 != 0) goto L_0x02a8
            java.util.List r15 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0648 }
        L_0x02a8:
            r8.A0O = r15     // Catch:{ all -> 0x0648 }
            r8.A03 = r2     // Catch:{ all -> 0x0648 }
            r8.A0J = r12     // Catch:{ all -> 0x0648 }
            r8.A0S = r11     // Catch:{ all -> 0x0648 }
            r8.A0N = r10     // Catch:{ all -> 0x0648 }
            r8.A0P = r5     // Catch:{ all -> 0x0648 }
            r0 = 2131433182(0x7f0b16de, float:1.8488142E38)
            android.view.View r1 = r7.findViewById(r0)     // Catch:{ all -> 0x0648 }
            r8.A09 = r1     // Catch:{ all -> 0x0648 }
            r0 = 2131428495(0x7f0b048f, float:1.8478636E38)
            android.view.View r0 = X.C06560Yg.A02(r1, r0)     // Catch:{ all -> 0x0648 }
            r8.A06 = r0     // Catch:{ all -> 0x0648 }
            r1 = 2131428502(0x7f0b0496, float:1.847865E38)
            android.view.View r0 = r8.A09     // Catch:{ all -> 0x0648 }
            android.view.View r0 = X.C06560Yg.A02(r0, r1)     // Catch:{ all -> 0x0648 }
            r8.A07 = r0     // Catch:{ all -> 0x0648 }
            X.4xc r1 = r8.A0x     // Catch:{ all -> 0x0648 }
            X.8uW r0 = r8.A0w     // Catch:{ all -> 0x0648 }
            r1.A06(r0)     // Catch:{ all -> 0x0648 }
            if (r13 == 0) goto L_0x02e7
            X.5Qv r1 = r8.A0i     // Catch:{ all -> 0x0648 }
            r0 = 1
            r1.A04 = r0     // Catch:{ all -> 0x0648 }
            java.util.Set r0 = r1.A0A     // Catch:{ all -> 0x0648 }
            r0.clear()     // Catch:{ all -> 0x0648 }
            r0.addAll(r13)     // Catch:{ all -> 0x0648 }
        L_0x02e7:
            X.2y5 r0 = r8.A0t     // Catch:{ all -> 0x0648 }
            X.33i r10 = r8.A0m     // Catch:{ all -> 0x0648 }
            int r1 = X.AnonymousClass34G.A02(r10, r0)     // Catch:{ all -> 0x0648 }
            X.4ea r2 = r8.A04()     // Catch:{ all -> 0x0648 }
            boolean r0 = r8.A0z     // Catch:{ all -> 0x0648 }
            if (r0 == 0) goto L_0x040b
            java.lang.String r0 = "createSimpleView"
            X.678 r1 = X.C154287cv.A00(r2, r0, r1)     // Catch:{ all -> 0x0648 }
            if (r1 == 0) goto L_0x040b
            java.lang.String r0 = "camera/CameraInterface/LiteCameraView/"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0648 }
        L_0x0304:
            r8.A0C = r1     // Catch:{ all -> 0x0648 }
            r1.setQrScanningEnabled(r4)     // Catch:{ all -> 0x0648 }
            X.678 r1 = r8.A0C     // Catch:{ all -> 0x0648 }
            android.view.View r1 = (android.view.View) r1     // Catch:{ all -> 0x0648 }
            r8.A08 = r1     // Catch:{ all -> 0x0648 }
            r0 = 8
            r1.setVisibility(r0)     // Catch:{ all -> 0x0648 }
            r1 = 2131428504(0x7f0b0498, float:1.8478654E38)
            android.view.View r0 = r8.A09     // Catch:{ all -> 0x0648 }
            android.view.ViewGroup r3 = X.C86644Kx.A0I(r0, r1)     // Catch:{ all -> 0x0648 }
            android.view.View r2 = r8.A08     // Catch:{ all -> 0x0648 }
            r1 = -2
            r0 = 17
            X.C86654Ky.A17(r2, r3, r1, r0)     // Catch:{ all -> 0x0648 }
            X.4ea r0 = r8.A04()     // Catch:{ all -> 0x0648 }
            boolean r0 = r0 instanceof com.whatsapp.camera.CameraActivity     // Catch:{ all -> 0x0648 }
            if (r0 == 0) goto L_0x033b
            boolean r0 = r8.A10     // Catch:{ all -> 0x0648 }
            if (r0 != 0) goto L_0x033b
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()     // Catch:{ all -> 0x0648 }
            X.02c r1 = (X.C001702c) r1     // Catch:{ all -> 0x0648 }
            java.lang.String r0 = "9:16"
            r1.A0t = r0     // Catch:{ all -> 0x0648 }
        L_0x033b:
            X.2oU r0 = r8.A0o     // Catch:{ all -> 0x0648 }
            android.content.res.Resources r3 = X.C54292oU.A00(r0)     // Catch:{ all -> 0x0648 }
            android.view.View r0 = r8.A06     // Catch:{ all -> 0x0648 }
            android.content.Context r2 = r0.getContext()     // Catch:{ all -> 0x0648 }
            r1 = 2130968860(0x7f04011c, float:1.7546386E38)
            r0 = 2131099976(0x7f060148, float:1.781232E38)
            int r0 = X.AnonymousClass5Yj.A02(r2, r1, r0)     // Catch:{ all -> 0x0648 }
            int r1 = r3.getColor(r0)     // Catch:{ all -> 0x0648 }
            android.view.View r0 = r8.A06     // Catch:{ all -> 0x0648 }
            r0.setBackgroundColor(r1)     // Catch:{ all -> 0x0648 }
            android.view.View r0 = r8.A07     // Catch:{ all -> 0x0648 }
            r0.setBackgroundColor(r1)     // Catch:{ all -> 0x0648 }
            r1 = 2131428483(0x7f0b0483, float:1.8478612E38)
            android.view.View r0 = r8.A09     // Catch:{ all -> 0x0648 }
            android.view.View r3 = X.C06560Yg.A02(r0, r1)     // Catch:{ all -> 0x0648 }
            r8.A05 = r3     // Catch:{ all -> 0x0648 }
            X.678 r1 = r8.A0C     // Catch:{ all -> 0x0648 }
            boolean r11 = r8.A10     // Catch:{ all -> 0x0648 }
            X.7HL r0 = r8.A0f     // Catch:{ all -> 0x0648 }
            boolean r5 = r0.A01     // Catch:{ all -> 0x0648 }
            X.7KW r0 = new X.7KW     // Catch:{ all -> 0x0648 }
            r0.<init>(r11, r5)     // Catch:{ all -> 0x0648 }
            X.5Y6 r2 = new X.5Y6     // Catch:{ all -> 0x0648 }
            r2.<init>(r3, r1, r0)     // Catch:{ all -> 0x0648 }
            r8.A0E = r2     // Catch:{ all -> 0x0648 }
            com.whatsapp.WaImageView r3 = r2.A0I     // Catch:{ all -> 0x0648 }
            r0 = 9
            X.C18290x4.A1I(r3, r2, r8, r0)     // Catch:{ all -> 0x0648 }
            r1 = 3
            X.90h r0 = new X.90h     // Catch:{ all -> 0x0648 }
            r0.<init>(r8, r1)     // Catch:{ all -> 0x0648 }
            r3.setOnLongClickListener(r0)     // Catch:{ all -> 0x0648 }
            r4 = 2
            X.AnonymousClass5CS.A00(r3, r8, r4)     // Catch:{ all -> 0x0648 }
            com.whatsapp.WaImageView r1 = r2.A0J     // Catch:{ all -> 0x0648 }
            r0 = 23
            X.C109315eQ.A01(r1, r8, r0)     // Catch:{ all -> 0x0648 }
            com.whatsapp.WaImageView r1 = r2.A0G     // Catch:{ all -> 0x0648 }
            r0 = 24
            X.C109315eQ.A01(r1, r8, r0)     // Catch:{ all -> 0x0648 }
            android.view.View r1 = r2.A0C     // Catch:{ all -> 0x0648 }
            r0 = 29
            X.C18320x8.A16(r1, r8, r2, r0)     // Catch:{ all -> 0x0648 }
            com.whatsapp.WaImageView r1 = r2.A0H     // Catch:{ all -> 0x0648 }
            r0 = 25
            X.C109315eQ.A01(r1, r8, r0)     // Catch:{ all -> 0x0648 }
            com.whatsapp.WaImageView r1 = r2.A0F     // Catch:{ all -> 0x0648 }
            r0 = 22
            X.C109315eQ.A01(r1, r8, r0)     // Catch:{ all -> 0x0648 }
            r1 = 2131428497(0x7f0b0491, float:1.847864E38)
            android.view.View r0 = r8.A09     // Catch:{ all -> 0x0648 }
            android.view.View r1 = X.C06560Yg.A02(r0, r1)     // Catch:{ all -> 0x0648 }
            r0 = 0
            r1.setFitsSystemWindows(r0)     // Catch:{ all -> 0x0648 }
            r1.invalidate()     // Catch:{ all -> 0x0648 }
            android.view.View r0 = r8.A08     // Catch:{ all -> 0x0648 }
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()     // Catch:{ all -> 0x0648 }
            r3 = 5
            X.C86614Ku.A1J(r0, r8, r3)     // Catch:{ all -> 0x0648 }
            X.8Fg r2 = new X.8Fg     // Catch:{ all -> 0x0648 }
            r2.<init>(r8)     // Catch:{ all -> 0x0648 }
            r1 = 2131428498(0x7f0b0492, float:1.8478642E38)
            android.view.View r0 = r8.A09     // Catch:{ all -> 0x0648 }
            android.view.View r1 = X.C06560Yg.A02(r0, r1)     // Catch:{ all -> 0x0648 }
            com.whatsapp.camera.mode.CameraModeTabLayout r1 = (com.whatsapp.camera.mode.CameraModeTabLayout) r1     // Catch:{ all -> 0x0648 }
            X.5MR r0 = new X.5MR     // Catch:{ all -> 0x0648 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0648 }
            r8.A0G = r0     // Catch:{ all -> 0x0648 }
            X.7DN r15 = new X.7DN     // Catch:{ all -> 0x0648 }
            r15.<init>(r8)     // Catch:{ all -> 0x0648 }
            r1 = 2131432929(0x7f0b15e1, float:1.848763E38)
            android.view.View r0 = r8.A09     // Catch:{ all -> 0x0648 }
            android.view.View r2 = X.C06560Yg.A02(r0, r1)     // Catch:{ all -> 0x0648 }
            com.whatsapp.camera.recording.RecordingView r2 = (com.whatsapp.camera.recording.RecordingView) r2     // Catch:{ all -> 0x0648 }
            X.33j r0 = r8.A0q     // Catch:{ all -> 0x0648 }
            r29 = r0
            X.2sH r0 = r8.A0n     // Catch:{ all -> 0x0648 }
            r22 = r0
            java.util.List r0 = r8.A0O     // Catch:{ all -> 0x0648 }
            boolean r12 = X.C627336j.A0N(r0)     // Catch:{ all -> 0x0648 }
            X.1VX r1 = r8.A0r     // Catch:{ all -> 0x0648 }
            r0 = 3185(0xc71, float:4.463E-42)
            if (r12 == 0) goto L_0x0419
            goto L_0x0417
        L_0x040b:
            java.lang.String r0 = "camera/CameraInterface/CameraView"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0648 }
            X.6gD r1 = new X.6gD     // Catch:{ all -> 0x0648 }
            r1.<init>(r2)     // Catch:{ all -> 0x0648 }
            goto L_0x0304
        L_0x0417:
            r0 = 4155(0x103b, float:5.822E-42)
        L_0x0419:
            long r12 = X.C56952sp.A06(r1, r0)     // Catch:{ all -> 0x0648 }
            r24 = 1048576(0x100000, double:5.180654E-318)
            long r24 = r24 * r12
            X.7HM r13 = r8.A0g     // Catch:{ all -> 0x0648 }
            java.util.List r12 = r8.A0O     // Catch:{ all -> 0x0648 }
            r0 = 0
            X.C162457s7.A0J(r12, r0)     // Catch:{ all -> 0x0648 }
            X.4uZ r0 = X.C627336j.A03(r12)     // Catch:{ all -> 0x0648 }
            boolean r0 = X.AnonymousClass000.A1W(r0)     // Catch:{ all -> 0x0648 }
            if (r0 == 0) goto L_0x049a
            X.1VX r12 = r13.A01     // Catch:{ all -> 0x0648 }
            r0 = 6728(0x1a48, float:9.428E-42)
            long r26 = X.C56952sp.A04(r12, r0)     // Catch:{ all -> 0x0648 }
        L_0x043c:
            X.5TA r0 = new X.5TA     // Catch:{ all -> 0x0648 }
            r19 = r0
            r20 = r15
            r21 = r2
            r23 = r29
            r19.<init>(r20, r21, r22, r23, r24, r26)     // Catch:{ all -> 0x0648 }
            r8.A0I = r0     // Catch:{ all -> 0x0648 }
            X.678 r13 = r8.A0C     // Catch:{ all -> 0x0648 }
            r2 = 2131428500(0x7f0b0494, float:1.8478646E38)
            android.view.View r0 = r8.A09     // Catch:{ all -> 0x0648 }
            android.view.ViewGroup r2 = X.C86644Kx.A0I(r0, r2)     // Catch:{ all -> 0x0648 }
            r12 = 1
            X.5OK r0 = new X.5OK     // Catch:{ all -> 0x0648 }
            r0.<init>(r2, r13, r12)     // Catch:{ all -> 0x0648 }
            r8.A0H = r0     // Catch:{ all -> 0x0648 }
            X.4ea r13 = r8.A04()     // Catch:{ all -> 0x0648 }
            X.5jt r2 = new X.5jt     // Catch:{ all -> 0x0648 }
            r2.<init>(r8)     // Catch:{ all -> 0x0648 }
            X.5eI r0 = new X.5eI     // Catch:{ all -> 0x0648 }
            r0.<init>(r13, r2, r12)     // Catch:{ all -> 0x0648 }
            r8.A0B = r0     // Catch:{ all -> 0x0648 }
            android.view.View r0 = r8.A08     // Catch:{ all -> 0x0648 }
            X.C86654Ky.A19(r0, r8, r3)     // Catch:{ all -> 0x0648 }
            X.5MR r0 = r8.A0G     // Catch:{ all -> 0x0648 }
            com.whatsapp.camera.mode.CameraModeTabLayout r3 = r0.A00     // Catch:{ all -> 0x0648 }
            android.content.Context r13 = r3.getContext()     // Catch:{ all -> 0x0648 }
            X.7DO r2 = new X.7DO     // Catch:{ all -> 0x0648 }
            r2.<init>(r0)     // Catch:{ all -> 0x0648 }
            X.6EN r0 = new X.6EN     // Catch:{ all -> 0x0648 }
            r0.<init>(r2)     // Catch:{ all -> 0x0648 }
            X.0N1 r2 = new X.0N1     // Catch:{ all -> 0x0648 }
            r2.<init>(r13, r0)     // Catch:{ all -> 0x0648 }
            r0 = 6
            X.C86654Ky.A19(r3, r2, r0)     // Catch:{ all -> 0x0648 }
            X.678 r2 = r8.A0C     // Catch:{ all -> 0x0648 }
            r3 = 0
            X.68l r0 = new X.68l     // Catch:{ all -> 0x0648 }
            r0.<init>(r8, r3)     // Catch:{ all -> 0x0648 }
            r2.setCameraCallback(r0)     // Catch:{ all -> 0x0648 }
            goto L_0x04a6
        L_0x049a:
            int r12 = r13.A00     // Catch:{ all -> 0x0648 }
            r0 = 14
            if (r12 != r0) goto L_0x04a3
            r26 = 30000(0x7530, double:1.4822E-319)
            goto L_0x043c
        L_0x04a3:
            r26 = -1
            goto L_0x043c
        L_0x04a6:
            if (r11 != 0) goto L_0x04c5
            X.4ea r11 = r8.A0A     // Catch:{ all -> 0x0648 }
            boolean r0 = r11 instanceof com.whatsapp.camera.CameraActivity     // Catch:{ all -> 0x0648 }
            if (r0 == 0) goto L_0x04c5
            X.7DK r2 = new X.7DK     // Catch:{ all -> 0x0648 }
            r2.<init>(r8)     // Catch:{ all -> 0x0648 }
            X.4NB r0 = new X.4NB     // Catch:{ all -> 0x0648 }
            r0.<init>(r11, r2)     // Catch:{ all -> 0x0648 }
            r8.A0D = r0     // Catch:{ all -> 0x0648 }
            boolean r0 = r0.canDetectOrientation()     // Catch:{ all -> 0x0648 }
            if (r0 == 0) goto L_0x04ce
            X.4NB r0 = r8.A0D     // Catch:{ all -> 0x0648 }
            r0.enable()     // Catch:{ all -> 0x0648 }
        L_0x04c5:
            r0 = 789(0x315, float:1.106E-42)
            boolean r0 = r1.A0X(r0)     // Catch:{ all -> 0x0648 }
            r8.A0X = r0     // Catch:{ all -> 0x0648 }
            goto L_0x04d2
        L_0x04ce:
            r0 = 0
            r8.A0D = r0     // Catch:{ all -> 0x0648 }
            goto L_0x04c5
        L_0x04d2:
            if (r0 == 0) goto L_0x04ed
            X.5Y6 r0 = r8.A0E     // Catch:{ all -> 0x0648 }
            com.whatsapp.WaImageView r0 = r0.A0I     // Catch:{ all -> 0x0648 }
            r0.setSoundEffectsEnabled(r3)     // Catch:{ all -> 0x0648 }
            android.media.SoundPool r2 = new android.media.SoundPool     // Catch:{ all -> 0x0648 }
            r2.<init>(r12, r12, r3)     // Catch:{ all -> 0x0648 }
            r8.A04 = r2     // Catch:{ all -> 0x0648 }
            X.4ea r1 = r8.A0A     // Catch:{ all -> 0x0648 }
            r0 = 2132017214(0x7f14003e, float:1.96727E38)
            int r0 = r2.load(r1, r0, r3)     // Catch:{ all -> 0x0648 }
            r8.A00 = r0     // Catch:{ all -> 0x0648 }
        L_0x04ed:
            X.4ea r0 = r8.A04()     // Catch:{ all -> 0x0648 }
            android.view.View r11 = r0.A00     // Catch:{ all -> 0x0648 }
            X.C626936e.A04(r11)     // Catch:{ all -> 0x0648 }
            X.C626936e.A04(r11)     // Catch:{ all -> 0x0648 }
            X.4ea r0 = r8.A0A     // Catch:{ all -> 0x0648 }
            r2 = 0
            if (r0 == 0) goto L_0x0509
            android.content.res.Configuration r0 = X.AnonymousClass001.A0M(r0)     // Catch:{ all -> 0x0648 }
            int r1 = r0.screenWidthDp     // Catch:{ all -> 0x0648 }
            r0 = 600(0x258, float:8.41E-43)
            if (r1 < r0) goto L_0x0509
            r2 = 1
        L_0x0509:
            X.5UD r12 = new X.5UD     // Catch:{ all -> 0x0648 }
            r12.<init>(r11, r2, r5)     // Catch:{ all -> 0x0648 }
            r8.A0F = r12     // Catch:{ all -> 0x0648 }
            X.30B r1 = r8.A0d     // Catch:{ all -> 0x0648 }
            X.4ea r11 = r8.A04()     // Catch:{ all -> 0x0648 }
            X.5Qv r2 = r8.A0i     // Catch:{ all -> 0x0648 }
            java.util.Set r0 = r2.A0A     // Catch:{ all -> 0x0648 }
            r28 = r0
            java.util.Objects.requireNonNull(r2)     // Catch:{ all -> 0x0648 }
            X.934 r0 = new X.934     // Catch:{ all -> 0x0648 }
            r0.<init>(r2, r4)     // Catch:{ all -> 0x0648 }
            X.3dY r26 = X.C72333dY.A06(r0)     // Catch:{ all -> 0x0648 }
            java.util.List r15 = r2.A09     // Catch:{ all -> 0x0648 }
            android.os.Handler r13 = X.AnonymousClass000.A0A()     // Catch:{ all -> 0x0648 }
            java.lang.String r0 = "camera-ui"
            X.2nB r4 = new X.2nB     // Catch:{ all -> 0x0648 }
            r4.<init>(r13, r1, r10, r0)     // Catch:{ all -> 0x0648 }
            r12.A05 = r4     // Catch:{ all -> 0x0648 }
            X.1VX r23 = r11.getAbProps()     // Catch:{ all -> 0x0648 }
            X.3Wi r10 = r11.A05     // Catch:{ all -> 0x0648 }
            X.4FS r1 = r11.A04     // Catch:{ all -> 0x0648 }
            X.4X4 r0 = new X.4X4     // Catch:{ all -> 0x0648 }
            r19 = r0
            r20 = r11
            r21 = r10
            r22 = r8
            r24 = r4
            r25 = r1
            r27 = r15
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ all -> 0x0648 }
            r12.A04 = r0     // Catch:{ all -> 0x0648 }
            androidx.recyclerview.widget.RecyclerView r11 = r12.A0A     // Catch:{ all -> 0x0648 }
            r11.setAdapter(r0)     // Catch:{ all -> 0x0648 }
            r0 = 1
            r11.A0h = r0     // Catch:{ all -> 0x0648 }
            android.content.res.Resources r1 = r12.A07     // Catch:{ all -> 0x0648 }
            r0 = 2131165619(0x7f0701b3, float:1.794546E38)
            int r4 = r1.getDimensionPixelSize(r0)     // Catch:{ all -> 0x0648 }
            X.6Ht r1 = new X.6Ht     // Catch:{ all -> 0x0648 }
            r0 = r29
            r1.<init>(r12, r0, r4)     // Catch:{ all -> 0x0648 }
            r11.A0o(r1)     // Catch:{ all -> 0x0648 }
            r10 = 1
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager     // Catch:{ all -> 0x0648 }
            r0.<init>(r10)     // Catch:{ all -> 0x0648 }
            r0.A1X(r3)     // Catch:{ all -> 0x0648 }
            r11.setLayoutManager(r0)     // Catch:{ all -> 0x0648 }
            X.5UD r11 = r8.A0F     // Catch:{ all -> 0x0648 }
            X.4ea r4 = r8.A04()     // Catch:{ all -> 0x0648 }
            com.whatsapp.camera.CameraBottomSheetBehavior r1 = r11.A0B     // Catch:{ all -> 0x0648 }
            X.4aG r0 = new X.4aG     // Catch:{ all -> 0x0648 }
            r0.<init>(r4, r8, r11)     // Catch:{ all -> 0x0648 }
            r1.A0a(r0)     // Catch:{ all -> 0x0648 }
            if (r5 == 0) goto L_0x05ad
            X.5UD r12 = r8.A0F     // Catch:{ all -> 0x0648 }
            X.4ea r11 = r8.A04()     // Catch:{ all -> 0x0648 }
            X.5O9 r5 = r8.A0s     // Catch:{ all -> 0x0648 }
            X.7DL r4 = new X.7DL     // Catch:{ all -> 0x0648 }
            r4.<init>(r8)     // Catch:{ all -> 0x0648 }
            X.4FS r1 = r8.A0v     // Catch:{ all -> 0x0648 }
            X.5ZM r0 = r12.A06     // Catch:{ all -> 0x0648 }
            if (r0 == 0) goto L_0x05a3
            r0.A0D(r10)     // Catch:{ all -> 0x0648 }
        L_0x05a3:
            X.54Y r0 = new X.54Y     // Catch:{ all -> 0x0648 }
            r0.<init>(r11, r4, r5)     // Catch:{ all -> 0x0648 }
            r12.A06 = r0     // Catch:{ all -> 0x0648 }
            X.AnonymousClass0x7.A1B(r0, r1)     // Catch:{ all -> 0x0648 }
        L_0x05ad:
            r1 = 2131428487(0x7f0b0487, float:1.847862E38)
            android.view.View r0 = r8.A09     // Catch:{ all -> 0x0648 }
            android.view.ViewGroup r4 = X.C86644Kx.A0I(r0, r1)     // Catch:{ all -> 0x0648 }
            X.4ea r1 = r8.A0A     // Catch:{ all -> 0x0648 }
            X.6Ei r0 = new X.6Ei     // Catch:{ all -> 0x0648 }
            r0.<init>(r1, r8)     // Catch:{ all -> 0x0648 }
            r4.addView(r0, r3)     // Catch:{ all -> 0x0648 }
            X.4ea r0 = r8.A04()     // Catch:{ all -> 0x0648 }
            X.0dc r5 = X.AnonymousClass0x2.A0J(r0)     // Catch:{ all -> 0x0648 }
            r4 = 2131430289(0x7f0b0b91, float:1.8482275E38)
            X.0eF r1 = r8.A0Z     // Catch:{ all -> 0x0648 }
            java.lang.String r0 = "media_picker_fragment_tag"
            r5.A0E(r1, r0, r4)     // Catch:{ all -> 0x0648 }
            r5.A02()     // Catch:{ all -> 0x0648 }
            if (r17 == 0) goto L_0x05f4
            int r0 = r17.size()     // Catch:{ all -> 0x0648 }
            if (r0 <= 0) goto L_0x05f4
            if (r18 == 0) goto L_0x05f4
            if (r16 == 0) goto L_0x05f4
            X.5Xq r0 = r2.A03     // Catch:{ all -> 0x0648 }
            java.util.Map r1 = r0.A00     // Catch:{ all -> 0x0648 }
            r1.clear()     // Catch:{ all -> 0x0648 }
            r0 = r18
            java.util.Map r0 = r0.A00     // Catch:{ all -> 0x0648 }
            r1.putAll(r0)     // Catch:{ all -> 0x0648 }
            r0 = r17
            r8.A0M(r0)     // Catch:{ all -> 0x0648 }
        L_0x05f4:
            r0 = 554251647(0x2109357f, float:4.6488207E-19)
            r6.A01(r0, r14)
            X.1VX r2 = r7.A0D
            X.5ZR r0 = r7.A06
            r1 = 30
            android.content.Intent r0 = com.whatsapp.RequestPermissionActivity.A0L(r7, r0, r2, r1)
            if (r0 != 0) goto L_0x0643
            r1 = 1
        L_0x0607:
            X.5ZS r0 = r7.A03
            if (r1 == 0) goto L_0x0628
            r0.A07()
        L_0x060e:
            int r0 = r9.size()
            if (r0 > r10) goto L_0x0622
            int r0 = r9.size()
            if (r0 != r10) goto L_0x00e4
            java.lang.Object r0 = r9.get(r3)
            boolean r0 = r0 instanceof com.whatsapp.jid.UserJid
            if (r0 != 0) goto L_0x00e4
        L_0x0622:
            X.2hV r0 = r7.A09
            r0.A01(r9)
            return
        L_0x0628:
            X.5UM r5 = r0.A0k
            r0 = 0
            r5.A01 = r0
            boolean r0 = r5.A0B
            if (r0 == 0) goto L_0x060e
            X.8vZ r4 = r5.A09
            java.lang.String r2 = "error_message"
            java.lang.String r1 = "permission"
            r0 = 554251647(0x2109357f, float:4.6488207E-19)
            r4.markerAnnotate((int) r0, (java.lang.String) r2, (java.lang.String) r1)
            r0 = 4
            r5.A05(r0)
            goto L_0x060e
        L_0x0643:
            r7.startActivityForResult(r0, r1)
            r1 = 0
            goto L_0x0607
        L_0x0648:
            r3 = move-exception
            X.5UM r2 = r8.A0k
            r1 = 554251647(0x2109357f, float:4.6488207E-19)
            java.lang.String r0 = "onCreate"
            r2.A01(r1, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.CameraActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        AnonymousClass5ZS r2 = this.A03;
        if (r2.A0A != null && ((i == 25 || i == 24) && r2.A0C.BHi())) {
            if (keyEvent.getRepeatCount() <= 0) {
                if (!r2.A0Q()) {
                    AnonymousClass5UD r0 = r2.A0F;
                    if (r0 != null && r0.A0B.A0O == 4) {
                        Log.i("cameraui/volume-key-down");
                        if (r2.A0i.A00 == 2) {
                            r2.A0A();
                        } else {
                            Handler handler = r2.A0I.A04;
                            handler.sendMessageDelayed(handler.obtainMessage(1), 500);
                        }
                    }
                } else if (r2.A0i.A00 == 2) {
                    r2.A0P(r2.A0I.A02());
                }
            }
            return true;
        }
        if (super.onKeyDown(i, keyEvent)) {
            return true;
        }
        return false;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        AnonymousClass5ZS r2 = this.A03;
        if (r2.A0A != null && r2.A0i.A00 != 2 && (i == 25 || i == 24)) {
            AnonymousClass5TA r3 = r2.A0I;
            Handler handler = r3.A04;
            handler.removeMessages(0);
            handler.removeMessages(1);
            r3.A01(false, false, false);
            if (r2.A0C.BIf()) {
                Log.i("cameraui/volume-key-up/stop-video-capture");
                r2.A0P(r2.A0I.A02());
            } else {
                AnonymousClass5UD r0 = r2.A0F;
                if (r0 != null && r0.A0B.A0O == 4 && r2.A0C.BHi()) {
                    Log.i("cameraui/volume-key-up/take-picture");
                    r2.A0C();
                }
            }
        } else if (super.onKeyUp(i, keyEvent)) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    public void A66() {
        if (!isDestroyed()) {
            this.A0D.A03((C95814uZ) null, 20);
            super.A66();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        AnonymousClass5ZS r3 = this.A03;
        if (r3.A0A != null) {
            if (!r3.A10 && !(r3.A04() instanceof CameraActivity)) {
                View A022 = C06560Yg.A02(r3.A09, R.id.camera_mode_tab_layout);
                View A023 = C06560Yg.A02(r3.A09, R.id.camera_view_holder);
                Rect A0N = AnonymousClass001.A0N();
                Rect A0N2 = AnonymousClass001.A0N();
                A023.getLocalVisibleRect(A0N);
                A023.getGlobalVisibleRect(A0N);
                r3.A09.getLocalVisibleRect(A0N2);
                r3.A09.getGlobalVisibleRect(A0N2);
                if (!AnonymousClass000.A1U(C86604Kt.A02(r3.A0o.A00), 2)) {
                    i = r3.A01;
                } else {
                    i = 0;
                }
                AnonymousClass5ZS.A00(A022, -1, i);
                r3.A0E(A022.getMeasuredHeight() + i);
                r3.A0G(A022.getMeasuredHeight() + i);
            }
            AnonymousClass5UD r1 = r3.A0F;
            if (r1 != null) {
                r1.A03(true);
            }
        }
    }

    public void onDestroy() {
        Integer num;
        int intValue;
        super.onDestroy();
        AnonymousClass5ZS r4 = this.A03;
        if (r4.A0A != null) {
            AnonymousClass5TA r3 = r4.A0I;
            Handler handler = r3.A04;
            handler.removeMessages(0);
            handler.removeMessages(1);
            r3.A01(false, false, false);
            r4.A0x.A07(r4.A0w);
            AnonymousClass5UD r32 = r4.A0F;
            if (r32 != null) {
                AnonymousClass5ZM r1 = r32.A06;
                if (r1 != null) {
                    r1.A0D(true);
                    r32.A06 = null;
                }
                C53492nB r0 = r32.A05;
                if (r0 != null) {
                    r0.A00();
                    r32.A05 = null;
                }
                AnonymousClass4X4 r12 = r32.A04;
                if (r12 != null) {
                    r12.A06.A02();
                    C186308v5 r02 = r12.A00;
                    if (r02 != null) {
                        r02.close();
                        r12.A00 = null;
                    }
                    r32.A04 = null;
                }
            }
            r4.A0A = null;
        }
        this.A02.A02().A02.A07(-1);
        AnonymousClass5U6 r2 = this.A05;
        C94824ry r03 = r2.A01;
        if (!(r03 == null || (num = r03.A02) == null || ((intValue = num.intValue()) != 3 && intValue != 4))) {
            r2.A02(intValue);
        }
        C107275b2.A07(this, this.A0D);
    }

    public void onPause() {
        super.onPause();
        this.A0B.A00();
        AnonymousClass5ZS r3 = this.A03;
        if (r3.A0A != null) {
            if (r3.A0C.BIf()) {
                r3.A0O(r3.A0I.A02());
            }
            if (r3.A08.getVisibility() == 0) {
                AnonymousClass5Y6 r2 = r3.A0E;
                r2.A0I.setVisibility(4);
                CircularProgressBar circularProgressBar = r2.A05;
                if (circularProgressBar != null) {
                    circularProgressBar.setVisibility(4);
                }
                r2.A00();
                r3.A08.setVisibility(8);
                r3.A0E.A0I.setEnabled(false);
            }
            r3.A0C.pause();
            AnonymousClass4NB r0 = r3.A0D;
            if (r0 != null) {
                r0.disable();
            }
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        Object r1;
        super.onRestoreInstanceState(bundle);
        AnonymousClass5ZS r3 = this.A03;
        C104405Qv r6 = r3.A0i;
        if (r6 != null) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("multi_selected");
            r6.A04 = true;
            Set set = r6.A0A;
            set.clear();
            if (parcelableArrayList != null) {
                set.addAll(parcelableArrayList);
            }
            r6.A03.A02(bundle);
            List list = r6.A09;
            list.clear();
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("captured_media");
            if (parcelableArrayList2 != null && !parcelableArrayList2.isEmpty()) {
                AnonymousClass5UR A022 = C620633i.A02(r6.A07);
                C162457s7.A0J(A022, 0);
                ArrayList A0c = C73783g4.A0c(parcelableArrayList2);
                Iterator it = parcelableArrayList2.iterator();
                while (it.hasNext()) {
                    C165877xm r12 = (C165877xm) it.next();
                    byte b = r12.A00;
                    if (b == 1) {
                        r1 = new C114195me(A022, r12.A02, r12.A01, r12.A03);
                    } else if (b == 3) {
                        r1 = new C114185md(r12.A02);
                    } else {
                        throw new AssertionError(AnonymousClass000.A0Y("Unsupported media type: ", AnonymousClass001.A0o(), b));
                    }
                    A0c.add(r1);
                }
                list.addAll(AnonymousClass002.A0J(A0c));
            }
            r6.A04 = !list.isEmpty();
            AnonymousClass5Y6 r0 = r3.A0E;
            if (r0 != null) {
                C86654Ky.A1L(r0, set);
            }
        }
        AnonymousClass5UD r02 = r3.A0F;
        if (r02 != null) {
            AnonymousClass4X4 r03 = r02.A04;
            if (r03 != null) {
                r03.A05();
            }
            r3.A0F.A00();
            boolean A1U = AnonymousClass000.A1U(r3.A0F.A0B.A0O, 3);
            View view = r3.A05;
            if (A1U) {
                view.setVisibility(4);
                r3.A0G.A00.setVisibility(4);
                AnonymousClass5OK r2 = r3.A0H;
                r2.A01.setBackgroundColor(C54292oU.A00(r3.A0o).getColor(R.color.f5nameremoved));
                return;
            }
            view.setVisibility(0);
            r3.A0G.A00.setVisibility(0);
        }
    }

    public void onResume() {
        super.onResume();
        AnonymousClass5ZS r4 = this.A03;
        if (r4.A0A != null && r4.A0R) {
            r4.A0C.Bk9();
            if (r4.A08.getVisibility() == 8) {
                r4.A08.setVisibility(0);
            }
            AnonymousClass4NB r0 = r4.A0D;
            if (r0 != null) {
                r0.enable();
            }
            AnonymousClass5Y6 r2 = r4.A0E;
            r2.A0I.setVisibility(0);
            CircularProgressBar circularProgressBar = r2.A05;
            if (circularProgressBar != null) {
                circularProgressBar.setVisibility(0);
            }
            r4.A0E.A00();
            CircularProgressBar circularProgressBar2 = r4.A0E.A05;
            if (circularProgressBar2 != null) {
                circularProgressBar2.setProgress(0);
            }
            if (r4.A0H.A03.getVisibility() == 0) {
                r4.A0H.A00(false, true);
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C08310eF A0D2 = getSupportFragmentManager().A0D("media_picker_fragment_tag");
        if (A0D2 != null) {
            getSupportFragmentManager().A0U(bundle, A0D2, "media_picker_fragment_tag");
        }
        C104405Qv r2 = this.A03.A0i;
        if (r2 != null) {
            bundle.putParcelableArrayList("multi_selected", AnonymousClass002.A0J(r2.A0A));
            C106105Xq r0 = r2.A03;
            Bundle A082 = AnonymousClass002.A08();
            r0.A03(A082);
            bundle.putBundle("media_preview_params", A082);
            List<C188018yB> A0C2 = C73723fy.A0C(r2.A09);
            ArrayList A0c = C73783g4.A0c(A0C2);
            for (C188018yB r1 : A0C2) {
                C162457s7.A0J(r1, 1);
                byte B9d = r1.B9d();
                A0c.add(new C165877xm(r1.B7c(), B9d, r1.BCL(), r1.BHc()));
            }
            bundle.putParcelableArrayList("captured_media", AnonymousClass002.A0J(A0c));
        }
    }
}

package com.whatsapp.status.playback;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0R4;
import X.AnonymousClass0x9;
import X.AnonymousClass1R1;
import X.AnonymousClass1VX;
import X.AnonymousClass2z0;
import X.AnonymousClass30V;
import X.AnonymousClass4L0;
import X.AnonymousClass4SB;
import X.AnonymousClass51x;
import X.AnonymousClass567;
import X.AnonymousClass5Go;
import X.AnonymousClass5LV;
import X.AnonymousClass5NV;
import X.AnonymousClass5R1;
import X.AnonymousClass5R3;
import X.AnonymousClass5U7;
import X.AnonymousClass5ZC;
import X.AnonymousClass5ZR;
import X.AnonymousClass66H;
import X.C08310eF;
import X.C102965Ky;
import X.C102975Kz;
import X.C104025Pi;
import X.C105285Uh;
import X.C105855Wr;
import X.C106595Zp;
import X.C110165fn;
import X.C113995mK;
import X.C117265re;
import X.C1226465e;
import X.C138386qG;
import X.C159117l9;
import X.C18260x0;
import X.C18300x5;
import X.C186628vg;
import X.C58152un;
import X.C620233e;
import X.C626936e;
import X.C70363aN;
import X.C89544dU;
import X.C89654ea;
import X.C94914sH;
import X.C95814uZ;
import android.content.Intent;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class StatusPlaybackActivity extends C89544dU implements C1226465e {
    public static final Interpolator A0Q = new C110165fn();
    public float A00 = 3.5f;
    public int A01;
    public int A02 = 0;
    public int A03 = 0;
    public int A04;
    public int A05 = -1;
    public long A06;
    public ViewPager A07;
    public AnonymousClass5ZR A08;
    public C620233e A09;
    public AnonymousClass2z0 A0A;
    public AnonymousClass1R1 A0B;
    public C113995mK A0C;
    public C104025Pi A0D;
    public AnonymousClass4SB A0E;
    public AnonymousClass5U7 A0F;
    public AnonymousClass5R1 A0G;
    public AnonymousClass30V A0H;
    public C105855Wr A0I;
    public Runnable A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M = false;
    public boolean A0N;
    public boolean A0O;
    public final Rect A0P = AnonymousClass001.A0N();

    public final StatusPlaybackFragment A75(String str) {
        if (str != null) {
            Iterator A4M = C89654ea.A4M(this);
            while (A4M.hasNext()) {
                C08310eF A0D2 = AnonymousClass4L0.A0D(A4M);
                if (A0D2 instanceof StatusPlaybackFragment) {
                    StatusPlaybackFragment statusPlaybackFragment = (StatusPlaybackFragment) A0D2;
                    if (str.equals(C18300x5.A0i(((StatusPlaybackContactFragment) statusPlaybackFragment).A0R))) {
                        return statusPlaybackFragment;
                    }
                }
            }
        }
        return null;
    }

    public boolean A64() {
        return true;
    }

    public void A66() {
        this.A0H.A03((C95814uZ) null, 19);
        super.A66();
    }

    public boolean A6C() {
        return true;
    }

    public final StatusPlaybackFragment A74(int i) {
        AnonymousClass5Go r0;
        C104025Pi r02 = this.A0D;
        if (r02 == null || i < 0 || i >= r02.A01.size() || (r0 = (AnonymousClass5Go) this.A0D.A01.get(i)) == null) {
            return null;
        }
        return A75(r0.A00.A0A.getRawString());
    }

    public final void A76(String str, int i, int i2) {
        int A002 = this.A0D.A00(str);
        if (A002 >= 0 && A002 < this.A0D.A01.size()) {
            if (A002 != this.A07.getCurrentItem()) {
                this.A0D.A01.remove(A002);
                int i3 = this.A01;
                if (A002 <= i3) {
                    this.A01 = i3 - 1;
                }
                int i4 = this.A05;
                if (A002 <= i4) {
                    this.A05 = i4 - 1;
                }
                this.A07.getAdapter().A05();
            } else if (this.A0K || A002 == AnonymousClass002.A04(this.A0D.A01, 1)) {
                finish();
            } else {
                this.A0J = new C117265re(this, str, i, i2);
                BUq(str, i, i2, true);
            }
        }
    }

    public AnonymousClass5ZC BCP() {
        return C58152un.A01;
    }

    public boolean BUq(String str, int i, int i2, boolean z) {
        ViewPager viewPager;
        int i3;
        int A002 = this.A0D.A00(str);
        if (z) {
            this.A03 = i;
            this.A02 = i2;
            if (A002 >= AnonymousClass002.A04(this.A0D.A01, 1) || this.A0K) {
                finish();
                return true;
            }
            this.A0E.A00 = this.A00;
            this.A00 = 3.5f;
            viewPager = this.A07;
            i3 = A002 + 1;
        } else if (A002 <= 0 || this.A0K) {
            return false;
        } else {
            this.A0E.A00 = this.A00;
            this.A00 = 3.5f;
            this.A03 = i;
            this.A02 = i2;
            viewPager = this.A07;
            i3 = A002 - 1;
        }
        viewPager.A0F(i3, true);
        this.A0E.A00 = 0.0f;
        return true;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float f;
        if (!this.A0E.isFinished() && this.A0E.timePassed() < this.A0E.getDuration() / 2) {
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            long eventTime = motionEvent.getEventTime() - this.A06;
            if (eventTime == 0 || eventTime > 1000) {
                f = 3.5f;
            } else {
                f = ((((float) eventTime) * 2.5f) / 1000.0f) + 1.0f;
            }
            this.A00 = f;
            this.A06 = motionEvent.getEventTime();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z = true;
        if (i == 10) {
            if (i2 != -1) {
                z = false;
            }
            this.A0N = z;
        } else if (i != 151) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            this.A0L = true;
            AnonymousClass0R4 adapter = this.A07.getAdapter();
            C626936e.A06(adapter);
            adapter.A05();
            this.A07.setCurrentItem(this.A04);
        } else {
            finish();
        }
    }

    public void onBackPressed() {
        C105285Uh A1Q;
        StatusPlaybackFragment A74 = A74(this.A07.getCurrentItem());
        if (!(A74 == null || !(A74 instanceof StatusPlaybackContactFragment) || (A1Q = ((StatusPlaybackContactFragment) A74).A1Q()) == null)) {
            AnonymousClass51x r3 = (AnonymousClass51x) A1Q;
            BottomSheetBehavior bottomSheetBehavior = r3.A00;
            if (bottomSheetBehavior.A0O == 3) {
                bottomSheetBehavior.A0S(4);
                return;
            }
            AnonymousClass5LV A092 = r3.A09();
            if (A092.A0F.A0M()) {
                A092.A0F.setExpanded(false);
                A092.A02.setVisibility(A092.A0F.getVisibility());
                r3.A0C();
                return;
            }
            r3.A08();
        }
        this.A03 = 3;
        super.onBackPressed();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0 || (keyCode != 24 && keyCode != 25)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        AnonymousClass5U7 r7 = this.A0F;
        boolean A1U = AnonymousClass000.A1U(keyCode, 24);
        C18260x0.A1D("StatusPlaybackAudioManager/adjustAudioVolume isUp=", AnonymousClass001.A0o(), A1U);
        AudioManager A0G2 = r7.A06.A0G();
        if (A0G2 != null) {
            int streamVolume = A0G2.getStreamVolume(3);
            int streamMaxVolume = A0G2.getStreamMaxVolume(3);
            if (A1U) {
                if (streamVolume < streamMaxVolume) {
                    A0G2.adjustSuggestedStreamVolume(1, 3, 16);
                    i = streamVolume + 1;
                }
                i = streamVolume;
            } else {
                if (streamVolume > 0) {
                    A0G2.adjustSuggestedStreamVolume(-1, 3, 16);
                    i = streamVolume - 1;
                }
                i = streamVolume;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("StatusPlaybackAudioManager/adjustAudioVolume previous=");
            A0o.append(streamVolume);
            A0o.append("; new=");
            A0o.append(i);
            C18260x0.A0w("; max=", A0o, streamMaxVolume);
            List<AnonymousClass66H> list = r7.A04;
            if (list != null) {
                for (AnonymousClass66H BMv : list) {
                    BMv.BMv(streamVolume, i, streamMaxVolume);
                }
            }
        }
        AnonymousClass5U7 r1 = this.A0F;
        if (r1.A05) {
            r1.A05 = false;
            List<AnonymousClass66H> list2 = r1.A04;
            if (list2 != null) {
                for (AnonymousClass66H BMr : list2) {
                    BMr.BMr(false);
                }
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01b1, code lost:
        if (r12.A0D.A0X(5558) == false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01b9, code lost:
        if (r1 != false) goto L_0x01bb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            super.onCreate(r13)
            X.1VX r1 = r12.A0D
            r0 = 6210(0x1842, float:8.702E-42)
            boolean r0 = r1.A0X(r0)
            r5 = 0
            android.view.Window r1 = r12.getWindow()
            if (r0 == 0) goto L_0x006e
            X.AnonymousClass0ID.A00(r1, r5)
            X.AnonymousClass4SG.A37(r12)
            android.view.Window r0 = r12.getWindow()
            r0.setStatusBarColor(r5)
        L_0x001f:
            android.view.Window r0 = r12.getWindow()
            X.C111095hX.A08(r0)
            X.1VX r1 = r12.A0D
            r0 = 2511(0x9cf, float:3.519E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0039
            android.view.Window r1 = r12.getWindow()
            r0 = 8192(0x2000, float:1.14794E-41)
            r1.setFlags(r0, r0)
        L_0x0039:
            r0 = 2131626094(0x7f0e086e, float:1.8879414E38)
            r12.setContentView((int) r0)
            android.view.Window r1 = r12.getWindow()
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r1.addFlags(r0)
            r0 = 2131433182(0x7f0b16de, float:1.8488142E38)
            android.view.View r1 = r12.findViewById(r0)
            r0 = 8
            X.AnonymousClass6B8.A00(r1, r12, r0)
            r0 = 2131432045(0x7f0b126d, float:1.8485836E38)
            android.view.View r0 = r12.findViewById(r0)
            androidx.viewpager.widget.ViewPager r0 = (androidx.viewpager.widget.ViewPager) r0
            r12.A07 = r0
            android.content.Context r2 = r0.getContext()
            android.view.animation.Interpolator r1 = A0Q
            X.4SB r0 = new X.4SB
            r0.<init>(r2, r1)
            r12.A0E = r0
            r4 = 1
            goto L_0x0074
        L_0x006e:
            r0 = 1024(0x400, float:1.435E-42)
            r1.setFlags(r0, r0)
            goto L_0x001f
        L_0x0074:
            java.lang.Class<androidx.viewpager.widget.ViewPager> r1 = androidx.viewpager.widget.ViewPager.class
            java.lang.String r0 = "mScroller"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x0086 }
            r2.setAccessible(r4)     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x0086 }
            androidx.viewpager.widget.ViewPager r1 = r12.A07     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x0086 }
            X.4SB r0 = r12.A0E     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x0086 }
            r2.set(r1, r0)     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x0086 }
        L_0x0086:
            java.lang.String r0 = X.AnonymousClass0x7.A0l(r12)
            com.whatsapp.jid.UserJid r3 = X.C627336j.A05(r0)
            android.content.Intent r0 = r12.getIntent()
            X.2z0 r0 = X.C107395bF.A02(r0)
            r12.A0A = r0
            r12.A04 = r5
            X.5Pi r2 = new X.5Pi
            r2.<init>()
            if (r0 != 0) goto L_0x01ca
            X.1fY r6 = X.AnonymousClass1fY.A00
            if (r3 != r6) goto L_0x00de
            X.33e r0 = r12.A09
            X.34r r6 = r0.A04()
            if (r6 == 0) goto L_0x00c9
            boolean r0 = r6.A0B()
            if (r0 != 0) goto L_0x00c9
            X.34r r1 = r6.A06()
            X.5Go r0 = new X.5Go
            r0.<init>(r1)
            r2.A01(r0)
            int r0 = r6.A03()
            boolean r0 = X.AnonymousClass001.A1W(r0)
            r12.A0O = r0
        L_0x00c9:
            java.util.List r0 = r2.A01
            int r0 = r0.size()
            if (r0 != 0) goto L_0x01e6
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "statusplaybackactivity/create/no statuses for "
            X.C18260x0.A1R(r1, r0, r3)
            r12.finish()
            return
        L_0x00de:
            X.1R1 r0 = r12.A0B
            boolean r0 = r0.A0j(r3)
            if (r0 != 0) goto L_0x01ca
            android.content.Intent r1 = r12.getIntent()
            java.lang.String r0 = "single_contact_update"
            boolean r11 = r1.getBooleanExtra(r0, r5)
            android.content.Intent r0 = r12.getIntent()
            java.lang.String r7 = "should_chain_viewed_statuses"
            boolean r1 = r0.getBooleanExtra(r7, r5)
            X.33e r0 = r12.A09
            X.34r r0 = r0.A05(r3)
            if (r1 == 0) goto L_0x017b
            if (r0 == 0) goto L_0x017b
            int r0 = r0.A03()
            if (r0 <= 0) goto L_0x017b
            X.5R1 r8 = r12.A0G
            X.33e r0 = r12.A09
            java.util.List r0 = r0.A06()
            X.C162457s7.A0J(r0, r5)
            java.util.ArrayList r1 = X.AnonymousClass002.A0J(r0)
            java.util.Comparator r0 = r8.A0C
            X.C73753g1.A0a(r1, r0)
            X.8U8 r8 = new X.8U8
            r8.<init>(r1)
        L_0x0123:
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()
            java.util.Iterator r10 = r8.iterator()
        L_0x012b:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0147
            X.34r r1 = X.C86664Kz.A19(r10)
            com.whatsapp.jid.UserJid r0 = r1.A0A
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x012b
            int r0 = r1.A03()
            boolean r0 = X.AnonymousClass001.A1W(r0)
            r12.A0O = r0
        L_0x0147:
            java.util.Iterator r10 = r8.iterator()
        L_0x014b:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0187
            X.34r r8 = X.C86664Kz.A19(r10)
            com.whatsapp.jid.UserJid r1 = r8.A0A
            boolean r0 = X.AnonymousClass000.A1Y(r1, r6)
            if (r0 != 0) goto L_0x014b
            boolean r0 = r12.A0O
            if (r0 == 0) goto L_0x0167
            int r0 = r8.A03()
            if (r0 <= 0) goto L_0x014b
        L_0x0167:
            X.1R1 r0 = r12.A0B
            boolean r0 = r0.A0j(r1)
            if (r0 != 0) goto L_0x014b
            boolean r0 = r1.equals(r3)
            if (r0 != 0) goto L_0x0177
            if (r11 != 0) goto L_0x014b
        L_0x0177:
            r9.add(r8)
            goto L_0x014b
        L_0x017b:
            X.33e r0 = r12.A09
            java.util.List r8 = r0.A06()
            r0 = 10
            X.AnonymousClass6A6.A00(r8, r0)
            goto L_0x0123
        L_0x0187:
            java.util.Iterator r6 = r9.iterator()
        L_0x018b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x019e
            X.34r r1 = X.C86664Kz.A19(r6)
            X.5Go r0 = new X.5Go
            r0.<init>(r1)
            r2.A01(r0)
            goto L_0x018b
        L_0x019e:
            android.content.Intent r0 = r12.getIntent()
            boolean r0 = r0.getBooleanExtra(r7, r5)
            if (r0 == 0) goto L_0x01b3
            X.1VX r1 = r12.A0D
            r0 = 5558(0x15b6, float:7.788E-42)
            boolean r0 = r1.A0X(r0)
            r1 = 1
            if (r0 != 0) goto L_0x01b4
        L_0x01b3:
            r1 = 0
        L_0x01b4:
            boolean r0 = r12.A0O
            if (r0 != 0) goto L_0x01bb
            r0 = 1
            if (r1 == 0) goto L_0x01bc
        L_0x01bb:
            r0 = 0
        L_0x01bc:
            r12.A0K = r0
            java.lang.String r0 = r3.getRawString()
            int r0 = r2.A00(r0)
            r12.A04 = r0
            goto L_0x00c9
        L_0x01ca:
            X.33e r0 = r12.A09
            X.34r r1 = r0.A05(r3)
            if (r1 == 0) goto L_0x00c9
            boolean r0 = r1.A0B()
            if (r0 != 0) goto L_0x00c9
            X.34r r1 = r1.A06()
            X.5Go r0 = new X.5Go
            r0.<init>(r1)
            r2.A01(r0)
            goto L_0x00c9
        L_0x01e6:
            X.5ZR r0 = r12.A08
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x01fd
            X.5ZR r1 = r12.A08
            boolean r0 = X.C107385bE.A08()
            if (r0 != 0) goto L_0x01fc
            boolean r0 = r1.A0E()
            if (r0 == 0) goto L_0x01fd
        L_0x01fc:
            r5 = 1
        L_0x01fd:
            r12.A0L = r5
            if (r5 != 0) goto L_0x021a
            boolean r0 = X.C107385bE.A08()
            if (r0 != 0) goto L_0x025f
            r5 = 2131892505(0x7f121919, float:1.941976E38)
        L_0x020a:
            r3 = 2131892506(0x7f12191a, float:1.9419762E38)
            r1 = 151(0x97, float:2.12E-43)
            boolean r0 = r12.isFinishing()
            if (r0 == 0) goto L_0x0257
            java.lang.String r0 = "request/permission/activity/storage passed activity is finishing: do nothing"
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x021a:
            r12.A0D = r2
            androidx.viewpager.widget.ViewPager r2 = r12.A07
            X.0df r1 = r12.getSupportFragmentManager()
            X.4kc r0 = new X.4kc
            r0.<init>(r1, r12)
            r2.setAdapter(r0)
            androidx.viewpager.widget.ViewPager r1 = r12.A07
            int r0 = r12.A04
            r1.setCurrentItem(r0)
            int r0 = r12.A04
            r12.A01 = r0
            androidx.viewpager.widget.ViewPager r1 = r12.A07
            X.5h2 r0 = new X.5h2
            r0.<init>(r12)
            r1.A0G(r0)
            androidx.viewpager.widget.ViewPager r1 = r12.A07
            r0 = 10
            X.AnonymousClass5CS.A00(r1, r12, r0)
            X.5U7 r3 = r12.A0F
            android.os.Handler r0 = X.AnonymousClass000.A0A()
            r3.A02 = r0
            X.33i r2 = r3.A06
            android.media.AudioManager r0 = r2.A0G()
            if (r0 == 0) goto L_0x0281
            goto L_0x026c
        L_0x0257:
            android.content.Intent r0 = com.whatsapp.RequestPermissionActivity.A0C(r12, r3, r5, r4)
            r12.startActivityForResult(r0, r1)
            goto L_0x021a
        L_0x025f:
            boolean r0 = X.C107385bE.A0A()
            r5 = 2131892508(0x7f12191c, float:1.9419766E38)
            if (r0 != 0) goto L_0x020a
            r5 = 2131892507(0x7f12191b, float:1.9419764E38)
            goto L_0x020a
        L_0x026c:
            int r1 = r0.getRingerMode()     // Catch:{ RuntimeException -> 0x0284 }
            r0 = 2
            if (r1 == r0) goto L_0x0281
            android.media.AudioManager r0 = r2.A0G()     // Catch:{ RuntimeException -> 0x0284 }
            if (r0 == 0) goto L_0x027f
            boolean r0 = r0.isMusicActive()     // Catch:{ RuntimeException -> 0x0284 }
            if (r0 != 0) goto L_0x0281
        L_0x027f:
            r0 = 1
            goto L_0x0282
        L_0x0281:
            r0 = 0
        L_0x0282:
            r3.A05 = r0     // Catch:{ RuntimeException -> 0x0284 }
        L_0x0284:
            androidx.viewpager.widget.ViewPager r0 = r12.A07
            r0.setKeepScreenOn(r4)
            X.AnonymousClass4SG.A3d(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.StatusPlaybackActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass5U7 r2 = this.A0F;
        Handler handler = r2.A02;
        if (handler != null) {
            handler.removeCallbacks(r2.A07);
        }
        r2.A01();
        r2.A04 = null;
        C113995mK r5 = this.A0C;
        C102975Kz r0 = r5.A00;
        AnonymousClass5R3 r4 = r5.A01;
        if (!(r0 == null || r4 == null)) {
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator A0v = AnonymousClass001.A0v(r4.A0D);
            while (A0v.hasNext()) {
                C102965Ky r7 = (C102965Ky) A0v.next();
                C94914sH r6 = new C94914sH();
                r6.A05 = Long.valueOf(r7.A05);
                r6.A06 = Long.valueOf(r7.A06);
                r6.A01 = Integer.valueOf(r7.A03);
                r6.A02 = AnonymousClass0x9.A0m(r7.A00);
                r6.A00 = Integer.valueOf(r7.A02);
                r6.A04 = AnonymousClass0x9.A0m(r7.A01);
                r6.A03 = AnonymousClass0x9.A0m(r7.A04);
                String str = r7.A07;
                r6.A07 = str;
                if (str == null || str.length() == 0) {
                    r5.A08.BhB(r6);
                } else {
                    r5.A08.Bh7(r6, C106595Zp.A00, true);
                }
                A0s.addAll(r7.A08.values());
            }
            r5.A0E.BkM(new C70363aN(r5, r4, A0s, 11));
            r5.A01 = null;
        }
        C105855Wr r42 = this.A0I;
        C138386qG r02 = r42.A00;
        if (r02 != null) {
            r02.A0G();
        }
        r42.A00 = null;
        AnonymousClass567 r03 = r42.A01;
        if (r03 != null) {
            r03.A0G();
        }
        r42.A01 = null;
        AnonymousClass1VX r1 = r42.A0C;
        if (r1.A0X(5175) && r1.A0X(5972)) {
            HashMap A0t = AnonymousClass001.A0t();
            C159117l9.A00(r42.A08.A00, ((AnonymousClass5NV) r42.A0L.get()).A00(), C186628vg.A00, A0t).A02();
        }
    }

    public int A5t() {
        return 78318969;
    }
}

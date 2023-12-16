package X;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Window;
import com.whatsapp.messaging.MessageService;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.5c5  reason: invalid class name and case insensitive filesystem */
public class C107895c5 implements Application.ActivityLifecycleCallbacks {
    public int A00;
    public boolean A01;
    public boolean A02 = true;
    public boolean A03;
    public boolean A04;
    public final AnonymousClass5HA A05;
    public final C29171iO A06;
    public final C44062Un A07;
    public final AnonymousClass4TW A08;
    public final AnonymousClass5XU A09;
    public final C105275Ug A0A;
    public final AnonymousClass5PA A0B;
    public final C620633i A0C;
    public final C106965aS A0D;
    public final AnonymousClass4FV A0E;
    public final C97154xi A0F;
    public final C45322Zo A0G;
    public final AnonymousClass2SL A0H;
    public final AnonymousClass3CN A0I;
    public final AnonymousClass5NX A0J;
    public final C49632gq A0K;
    public final C56592sF A0L;
    public final C105115Tq A0M;
    public final C45502a7 A0N;
    public final C111155hd A0O;
    public final C54112oC A0P;
    public final AnonymousClass4FS A0Q;
    public final C183538qC A0R;
    public final C183538qC A0S;

    public static final void A00(Activity activity, Boolean bool, String str) {
        if (activity instanceof C89684ei) {
            C89684ei r2 = (C89684ei) activity;
            if (r2.A5t() != 78318969) {
                return;
            }
            if (bool.booleanValue()) {
                r2.A61(str);
            } else {
                r2.A60(str);
            }
        }
    }

    public static void A01(Object obj, String str, String str2, Collection collection) {
        collection.add(new AnonymousClass3Z6(obj, new ComponentName(str, str2)));
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        A02(activity, "Create", true);
        if (this.A00 == 0) {
            this.A0L.A09 = true;
        }
        if (activity instanceof C003203q) {
            ((C003203q) activity).getSupportFragmentManager().A0X.A01.add(new AnonymousClass0L9(this.A08, true));
        }
        Window window = activity.getWindow();
        window.setCallback(new C110145fl(window.getCallback(), this.A0O, this.A0P));
    }

    public void onActivityDestroyed(Activity activity) {
        Activity activity2 = activity;
        A02(activity, "Destroy", false);
        this.A0J.A00();
        AnonymousClass3CN r3 = this.A0I;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Activity_");
        AnonymousClass000.A1A(activity, A0o);
        C18280x3.A1G(A0o, "_", activity);
        String obj = A0o.toString();
        ConcurrentHashMap concurrentHashMap = r3.A05;
        if (!concurrentHashMap.containsKey(obj) && ((long) concurrentHashMap.size()) <= 100) {
            C18260x0.A0q("MemoryLeakReporter. Tracking object for key ", obj, AnonymousClass001.A0o());
            concurrentHashMap.put(obj, new C73283fF(activity2, obj, r3.A04, SystemClock.elapsedRealtime()));
            r3.A02.BkN(new C70013Zn(r3, 19), "MemoryLeakReporter.pruneRefs");
        }
    }

    public void onActivityPaused(Activity activity) {
        if (!(activity instanceof C1222863u)) {
            C56592sF r2 = this.A0L;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("pause_");
            r2.A05(AnonymousClass000.A0R(activity.getClass(), A0o));
        }
        if (!(activity instanceof AnonymousClass67A)) {
            this.A0K.A00();
        }
        A02(activity, "Pause", true);
        if (this.A03) {
            this.A0Q.BkP(new C117665sI(this, activity, 1, this.A04));
        }
        ((C111115hZ) this.A0S.get()).A02 = null;
    }

    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        A00(activity, Boolean.FALSE, "onCreated");
    }

    public void onActivityPostResumed(Activity activity) {
        A00(activity, Boolean.FALSE, "onResumed");
        A00(activity, Boolean.TRUE, "onRendered");
    }

    public void onActivityPostStarted(Activity activity) {
        A00(activity, Boolean.FALSE, "onStarted");
    }

    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        if (activity instanceof C89684ei) {
            C89684ei r4 = (C89684ei) activity;
            if (r4.A5t() == 78318969) {
                AnonymousClass5ND r0 = r4.A00;
                r0.A01.A0F(C18310x6.A0n(activity), -1);
                r4.A61("onCreated");
            }
            C97154xi r1 = this.A0F;
            AtomicBoolean atomicBoolean = r1.A02;
            if (!atomicBoolean.get()) {
                C18260x0.A0q("SplitWindowManager/init ", "ActivityLifeCycleCallbacks", AnonymousClass001.A0o());
                if (r1.A0E() && !atomicBoolean.getAndSet(true)) {
                    C18260x0.A0q("SplitWindowManager/init split rules: ", "ActivityLifeCycleCallbacks", AnonymousClass001.A0o());
                    C05850Vf r8 = (C05850Vf) r1.A0A.getValue();
                    Context context = r1.A03;
                    String packageName = context.getPackageName();
                    C162457s7.A0H(packageName);
                    C162457s7.A0J(packageName, 0);
                    ComponentName componentName = new ComponentName(packageName, "com.whatsapp.HomeActivity");
                    AnonymousClass3Z6[] r2 = new AnonymousClass3Z6[1];
                    AnonymousClass3Z6.A09(componentName, new ComponentName(packageName, "com.whatsapp.Conversation"), r2, 0);
                    List<AnonymousClass3Z6> A0p = AnonymousClass8UF.A0p(r2);
                    if (C18270x1.A1V(r1.A07)) {
                        A01(componentName, packageName, "com.whatsapp.chatinfo.ContactInfoActivity", A0p);
                        A01(componentName, packageName, "com.whatsapp.group.GroupChatInfoActivity", A0p);
                        A01(componentName, packageName, "com.whatsapp.chatinfo.ListChatInfoActivity", A0p);
                        A01(componentName, packageName, "com.whatsapp.newsletter.NewsletterInfoActivity", A0p);
                        A01(componentName, packageName, "com.whatsapp.gallery.MediaGalleryActivity", A0p);
                    }
                    AnonymousClass66R r6 = r1.A09;
                    if (C18270x1.A1V(r6)) {
                        ComponentName componentName2 = new ComponentName(packageName, "com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity");
                        A0p.add(AnonymousClass3Z6.A02(componentName, componentName2));
                        A01(componentName2, packageName, "com.whatsapp.Conversation", A0p);
                    }
                    int A062 = AnonymousClass001.A06(C86604Kt.A00(context), 600.0f);
                    ArrayList A0c = C73783g4.A0c(A0p);
                    for (AnonymousClass3Z6 r02 : A0p) {
                        A0c.add(new AnonymousClass0QC((ComponentName) r02.first, (ComponentName) r02.second));
                    }
                    C03770Lm r03 = new C03770Lm(C73723fy.A0P(A0c), A062, A062);
                    C01360Ah r04 = new C01360Ah(r03.A02, r03.A01, r03.A00);
                    C16100sT r42 = r8.A01;
                    r42.Bii(r04);
                    Intent A072 = C18320x8.A07();
                    C18320x8.A10(A072, packageName, "com.whatsapp.home.ui.HomePlaceholderActivity");
                    r42.Bii(C97154xi.A00(A072, packageName, C18290x4.A12("com.whatsapp.HomeActivity"), A062, A062));
                    if (C18270x1.A1V(r6)) {
                        Intent A073 = C18320x8.A07();
                        C18320x8.A10(A073, packageName, "com.whatsapp.home.ui.StarredMessagesPlaceholderActivity");
                        r42.Bii(C97154xi.A00(A073, packageName, C18290x4.A12("com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity"), A062, A062));
                    }
                    List A12 = C18290x4.A12("com.whatsapp.backup.google.GoogleDriveNewUserSetupActivity");
                    ArrayList A0c2 = C73783g4.A0c(A12);
                    Iterator it = A12.iterator();
                    while (it.hasNext()) {
                        A0c2.add(new AnonymousClass0P7(new ComponentName(packageName, AnonymousClass001.A0m(it))));
                    }
                    r42.Bii(new C01350Ag(new C03430Kc(C73723fy.A0P(A0c2)).A00));
                }
            }
        }
    }

    public void onActivityPreResumed(Activity activity) {
        A00(activity, Boolean.TRUE, "onResumed");
    }

    public void onActivityPreStarted(Activity activity) {
        A00(activity, Boolean.TRUE, "onStarted");
    }

    public void onActivityResumed(Activity activity) {
        AnonymousClass5ZC r0;
        boolean z;
        A02(activity, "Resume", true);
        if (activity instanceof AnonymousClass64D) {
            r0 = ((AnonymousClass64D) activity).BCP();
        } else {
            r0 = C58152un.A03;
        }
        if (!r0.A00()) {
            this.A04 = false;
            z = false;
        } else if (new Random().nextBoolean()) {
            this.A04 = true;
            z = true;
        } else {
            this.A04 = false;
            this.A03 = true;
            ((C111115hZ) this.A0S.get()).A02 = AnonymousClass0x9.A14(activity);
        }
        this.A03 = false;
        if (z) {
            this.A0Q.BkP(new C117665sI(this, activity, 1, z));
        }
        ((C111115hZ) this.A0S.get()).A02 = AnonymousClass0x9.A14(activity);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        A02(activity, "Start", true);
        this.A07.A00((String) null);
        if (this.A00 == 0 && !this.A01) {
            Log.i("app-init/application foregrounded");
            MessageService.A03(activity, this.A0N);
            AnonymousClass5XU r1 = this.A09;
            if (!r1.A03() && !r1.A02()) {
                ((C66523Lt) this.A0R.get()).A09(1, true, false, false, false);
            }
            AnonymousClass5PA r3 = this.A0B;
            r3.A0J.execute(new C117115rP(r3, 5));
            C105275Ug r0 = this.A0A;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            AnonymousClass33p r4 = r0.A04;
            if (elapsedRealtime < AnonymousClass0x2.A0B(AnonymousClass0x2.A0F(r4), "app_background_time")) {
                C18260x0.A0M(r4, "app_background_time", -1800000);
            }
            C29171iO r02 = this.A06;
            r02.A00 = true;
            Iterator A032 = C61102zi.A03(r02);
            while (A032.hasNext()) {
                ((AnonymousClass4CD) A032.next()).BMV();
            }
        }
        int i = this.A00;
        this.A02 = AnonymousClass000.A1T(i);
        this.A00 = i + 1;
        Window window = activity.getWindow();
        Window.Callback callback = window.getCallback();
        if (!(callback instanceof C110145fl)) {
            window.setCallback(new C110145fl(callback, this.A0O, this.A0P));
        }
        C105275Ug r42 = this.A0A;
        if (!r42.A04()) {
            AnonymousClass33p r32 = r42.A04;
            if (C18280x3.A1W(AnonymousClass0x2.A0F(r32), "privacy_fingerprint_enabled")) {
                Log.i("AppAuthManager/resetAppAuthSettingIfNecessary: no biometrics enrolled and setting was enabled");
                C18270x1.A0l(C18270x1.A03(r32), "privacy_fingerprint_enabled", false);
                r42.A03(false);
            }
        }
    }

    public void onActivityStopped(Activity activity) {
        AnonymousClass66X r0;
        A02(activity, "Stop", true);
        this.A07.A00((String) null);
        boolean isChangingConfigurations = activity.isChangingConfigurations();
        this.A01 = isChangingConfigurations;
        int i = this.A00 - 1;
        this.A00 = i;
        if (i == 0 && !isChangingConfigurations) {
            this.A0D.A03("App", "backgrounded");
            Log.i("app-init/application backgrounded");
            C56592sF r1 = this.A0L;
            r1.A05("app_session_ended");
            r1.A09 = false;
            AnonymousClass2SL r3 = this.A0H;
            C71353by.A01(r3.A05, r3, this.A0C, 48);
            if (!"com.whatsapp.authentication.AppAuthenticationActivity".equals(AnonymousClass000.A0O(activity))) {
                C105275Ug r2 = this.A0A;
                AnonymousClass33p r5 = r2.A04;
                if (!C18280x3.A1W(AnonymousClass0x2.A0F(r5), "fingerprint_authentication_needed")) {
                    Log.i("AppAuthManager/onApplicationBackground");
                    r2.A03(true);
                    C18270x1.A0i(C18270x1.A03(r5), "app_background_time", SystemClock.elapsedRealtime());
                }
            }
            C105115Tq r22 = this.A0M;
            if ((r22.A03() || r22.A07.BI5(689639794)) && (r0 = r22.A00) != null) {
                r0.report();
                r22.A01 = Boolean.FALSE;
                r22.A00 = null;
            }
            AnonymousClass5PA r32 = this.A0B;
            r32.A0J.execute(new C117115rP(r32, 4));
            List<C100915Ct> list = (List) C18290x4.A0j(this.A05.A00, 0);
            if (list != null) {
                for (C100915Ct r02 : list) {
                    C126256Nd r33 = r02.A00;
                    ((C180578lI) r33.A02).B7T(C141406vW.CONCURRENT).execute(new C172668Mf(r33, 11));
                }
            }
            C29171iO r12 = this.A06;
            r12.A00 = false;
            Iterator A032 = C61102zi.A03(r12);
            while (A032.hasNext()) {
                ((AnonymousClass4CD) A032.next()).onAppBackgrounded();
            }
            this.A02 = true;
        }
    }

    public C107895c5(AnonymousClass5HA r2, C29171iO r3, C44062Un r4, AnonymousClass4TW r5, AnonymousClass5XU r6, C105275Ug r7, AnonymousClass5PA r8, C620633i r9, C106965aS r10, AnonymousClass4FV r11, C97154xi r12, C45322Zo r13, AnonymousClass2SL r14, AnonymousClass3CN r15, AnonymousClass5NX r16, C49632gq r17, C56592sF r18, C105115Tq r19, C45502a7 r20, C111155hd r21, C54112oC r22, AnonymousClass4FS r23, C183538qC r24, C183538qC r25) {
        this.A07 = r4;
        this.A0Q = r23;
        this.A09 = r6;
        this.A0E = r11;
        this.A0G = r13;
        this.A0A = r7;
        this.A0B = r8;
        this.A0P = r22;
        this.A0L = r18;
        this.A0C = r9;
        this.A0O = r21;
        this.A0K = r17;
        this.A0S = r25;
        this.A0I = r15;
        this.A0F = r12;
        this.A0H = r14;
        this.A0R = r24;
        this.A0M = r19;
        this.A06 = r3;
        this.A08 = r5;
        this.A0J = r16;
        this.A0N = r20;
        this.A0D = r10;
        this.A05 = r2;
        this.A00 = 0;
    }

    public final void A02(Activity activity, String str, boolean z) {
        StringBuilder A0o = AnonymousClass001.A0o();
        Class<?> cls = activity.getClass();
        A0o.append(cls.getName());
        C18260x0.A0s(".on", str, A0o);
        if (z) {
            this.A0D.A03(cls.getSimpleName(), str);
        }
    }
}

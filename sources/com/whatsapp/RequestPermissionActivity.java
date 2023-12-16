package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass33p;
import X.AnonymousClass367;
import X.AnonymousClass4N3;
import X.AnonymousClass5UF;
import X.AnonymousClass5ZR;
import X.AnonymousClass73T;
import X.C005205m;
import X.C05880Vi;
import X.C06740Za;
import X.C08270df;
import X.C08310eF;
import X.C103535Ni;
import X.C107035aa;
import X.C107385bE;
import X.C162197rQ;
import X.C18260x0;
import X.C18270x1;
import X.C18290x4;
import X.C18300x5;
import X.C49632gq;
import X.C56502s5;
import X.C620633i;
import X.C622534h;
import X.C626936e;
import X.C64223Cq;
import X.C69263Wi;
import X.C72023d3;
import X.C86614Ku;
import X.C86624Kv;
import X.C89674ec;
import X.C997357z;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.style.URLSpan;
import android.view.KeyEvent;
import android.widget.TextView;
import com.whatsapp.registration.directmigration.RequestPermissionFromSisterAppActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RequestPermissionActivity extends C89674ec {
    public static final Map A0C;
    public C103535Ni A00;
    public C64223Cq A01;
    public C620633i A02;
    public AnonymousClass5ZR A03;
    public AnonymousClass33p A04;
    public AnonymousClass1VX A05;
    public C49632gq A06;
    public C56502s5 A07;
    public String A08;
    public Set A09;
    public boolean A0A;
    public boolean A0B;

    static {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        HashMap hashMap = new HashMap(4);
        int[] iArr = new int[6];
        iArr[0] = R.string.f11nameremoved;
        boolean A0A2 = C107385bE.A0A();
        if (A0A2) {
            i = R.string.f11nameremoved;
        } else {
            int i9 = Build.VERSION.SDK_INT;
            i = R.string.f11nameremoved;
            if (i9 < 30) {
                i = R.string.f11nameremoved;
            }
        }
        iArr[1] = i;
        iArr[2] = R.string.f11nameremoved;
        if (A0A2) {
            i2 = R.string.f11nameremoved;
        } else {
            int i10 = Build.VERSION.SDK_INT;
            i2 = R.string.f11nameremoved;
            if (i10 < 30) {
                i2 = R.string.f11nameremoved;
            }
        }
        iArr[3] = i2;
        iArr[4] = R.string.f11nameremoved;
        iArr[5] = R.string.f11nameremoved;
        AnonymousClass0x2.A1H(iArr, hashMap, 30);
        AnonymousClass0x2.A1H(iArr, hashMap, 29);
        int[] iArr2 = new int[6];
        iArr2[0] = R.string.f11nameremoved;
        boolean A0A3 = C107385bE.A0A();
        if (A0A3) {
            i3 = R.string.f11nameremoved;
        } else {
            int i11 = Build.VERSION.SDK_INT;
            i3 = R.string.f11nameremoved;
            if (i11 < 30) {
                i3 = R.string.f11nameremoved;
            }
        }
        iArr2[1] = i3;
        iArr2[2] = R.string.f11nameremoved;
        if (A0A3) {
            i4 = R.string.f11nameremoved;
        } else {
            int i12 = Build.VERSION.SDK_INT;
            i4 = R.string.f11nameremoved;
            if (i12 < 30) {
                i4 = R.string.f11nameremoved;
            }
        }
        iArr2[3] = i4;
        iArr2[4] = R.string.f11nameremoved;
        iArr2[5] = R.string.f11nameremoved;
        hashMap.put(31, iArr2);
        int[] iArr3 = new int[6];
        iArr3[0] = R.string.f11nameremoved;
        boolean A0A4 = C107385bE.A0A();
        if (A0A4) {
            i5 = R.string.f11nameremoved;
        } else {
            int i13 = Build.VERSION.SDK_INT;
            i5 = R.string.f11nameremoved;
            if (i13 < 30) {
                i5 = R.string.f11nameremoved;
            }
        }
        iArr3[1] = i5;
        iArr3[2] = R.string.f11nameremoved;
        if (A0A4) {
            i6 = R.string.f11nameremoved;
        } else {
            int i14 = Build.VERSION.SDK_INT;
            i6 = R.string.f11nameremoved;
            if (i14 < 30) {
                i6 = R.string.f11nameremoved;
            }
        }
        iArr3[3] = i6;
        iArr3[4] = R.string.f11nameremoved;
        iArr3[5] = R.string.f11nameremoved;
        hashMap.put(32, iArr3);
        int[] iArr4 = new int[6];
        iArr4[0] = R.string.f11nameremoved;
        boolean A0A5 = C107385bE.A0A();
        if (A0A5) {
            i7 = R.string.f11nameremoved;
        } else {
            int i15 = Build.VERSION.SDK_INT;
            i7 = R.string.f11nameremoved;
            if (i15 < 30) {
                i7 = R.string.f11nameremoved;
            }
        }
        iArr4[1] = i7;
        iArr4[2] = R.string.f11nameremoved;
        if (A0A5) {
            i8 = R.string.f11nameremoved;
        } else {
            int i16 = Build.VERSION.SDK_INT;
            i8 = R.string.f11nameremoved;
            if (i16 < 30) {
                i8 = R.string.f11nameremoved;
            }
        }
        iArr4[3] = i8;
        iArr4[4] = R.string.f11nameremoved;
        iArr4[5] = R.string.f11nameremoved;
        hashMap.put(33, iArr4);
        A0C = Collections.unmodifiableMap(hashMap);
    }

    public static void A0b(Activity activity, int i, int i2) {
        if (activity.isFinishing()) {
            Log.d("request/permission/activity/storage passed activity is finishing: do nothing");
        } else {
            activity.startActivityForResult(A0C(activity, i, i2, false), 151);
        }
    }

    public static void A0c(Activity activity, int i, int i2, int i3) {
        if (activity.isFinishing()) {
            Log.d("request/permission/activity/storage passed activity is finishing: do nothing");
        } else {
            activity.startActivityForResult(A0C(activity, i, i2, false), i3);
        }
    }

    public static void A0l(AnonymousClass33p r5, String[] strArr) {
        for (String str : strArr) {
            C18260x0.A0q("wa-shared-prefs/set-permission-requested ", str, AnonymousClass001.A0o());
            C18270x1.A0f(C18270x1.A03(r5), str);
            if (AnonymousClass367.A03(str, C622534h.A09)) {
                C18270x1.A0l(C18270x1.A03(r5), "live_location_is_new_user", true);
                C18270x1.A0l(C18270x1.A03(r5), "nearby_location_new_user", true);
            }
        }
    }

    public static boolean A0p(Activity activity, String[] strArr) {
        for (String A032 : strArr) {
            if (!C005205m.A03(activity, A032)) {
                return false;
            }
        }
        return true;
    }

    public static boolean A0t(AnonymousClass33p r4, String[] strArr) {
        for (String A2O : strArr) {
            if (r4.A2O(A2O)) {
                return false;
            }
        }
        return true;
    }

    public static Intent A0C(Context context, int i, int i2, boolean z) {
        AnonymousClass5UF r1 = new AnonymousClass5UF(context);
        r1.A01 = R.drawable.permission_storage;
        r1.A0D = C107035aa.A04();
        r1.A02 = i;
        r1.A03 = i2;
        return AnonymousClass5UF.A00(r1, z);
    }

    public static Intent A0L(Context context, AnonymousClass5ZR r9, AnonymousClass1VX r10, int i) {
        AnonymousClass5UF r4;
        int[] iArr = (int[]) AnonymousClass001.A0i(A0C, i);
        boolean A1Y = AnonymousClass000.A1Y(r9.A04(), C997357z.DENIED);
        boolean A1S = AnonymousClass000.A1S(r9.A02("android.permission.CAMERA"));
        if (iArr == null) {
            C18260x0.A0x("conversation/check/camera/storage/permissions/unexpected request code ", AnonymousClass001.A0o(), i);
        } else if (A1S) {
            if (A1Y) {
                r4.A0A = new int[]{R.drawable.permission_storage, R.drawable.permission_plus, R.drawable.permission_cam};
                r4.A0D = C107035aa.A00();
                r4.A02 = iArr[0];
                r4.A03 = iArr[1];
            } else {
                r4 = new AnonymousClass5UF(context);
                r4.A01 = R.drawable.permission_cam;
                r4.A02 = iArr[4];
                r4.A03 = iArr[5];
                r4.A0D = new String[]{"android.permission.CAMERA"};
            }
            return AnonymousClass5UF.A00(r4, false);
        } else if (A1Y) {
            if (r10.A0X(4340)) {
                return A0X(context, r10, AnonymousClass73T.A00());
            }
            return A0C(context, iArr[2], iArr[3], false);
        }
        return null;
    }

    public static Intent A0X(Context context, AnonymousClass1VX r4, int i) {
        String[] A042;
        if (r4.A0X(4340)) {
            A042 = C107035aa.A02();
        } else {
            A042 = C107035aa.A04();
        }
        AnonymousClass5UF r1 = new AnonymousClass5UF(context);
        r1.A01 = R.drawable.permission_storage;
        r1.A0D = A042;
        r1.A02 = R.string.f11nameremoved;
        r1.A03 = i;
        return AnonymousClass5UF.A00(r1, false);
    }

    public static Intent A0Y(Context context, AnonymousClass1VX r4, int i, int i2) {
        String[] A042;
        if (r4.A0X(4340)) {
            A042 = C107035aa.A03();
        } else {
            A042 = C107035aa.A04();
        }
        AnonymousClass5UF r1 = new AnonymousClass5UF(context);
        r1.A01 = R.drawable.permission_storage;
        r1.A0D = A042;
        r1.A02 = i;
        r1.A03 = i2;
        return AnonymousClass5UF.A00(r1, false);
    }

    public static AnonymousClass5UF A0Z(Activity activity, String str) {
        AnonymousClass5UF r1 = new AnonymousClass5UF(activity);
        r1.A01 = R.drawable.permission_wifi;
        r1.A0D = new String[]{"android.permission.NEARBY_WIFI_DEVICES"};
        r1.A04 = R.string.f11nameremoved;
        r1.A06 = str;
        return r1;
    }

    public static void A0a(Activity activity) {
        if (activity.isFinishing()) {
            Log.d("request/permission/activity/phone_number activity is finishing: do nothing");
            return;
        }
        AnonymousClass5UF r2 = new AnonymousClass5UF(activity);
        r2.A01 = R.drawable.permission_call;
        r2.A0D = (String[]) AnonymousClass5ZR.A00().toArray(new String[0]);
        r2.A02 = R.string.f11nameremoved;
        r2.A03 = R.string.f11nameremoved;
        activity.startActivityForResult(AnonymousClass5UF.A00(r2, true), 155);
    }

    public static void A0d(Activity activity, int i, int i2, boolean z) {
        if (activity.isFinishing()) {
            Log.d("request/permission/activity/contacts passed activity is finishing: do nothing");
            return;
        }
        AnonymousClass5UF r3 = new AnonymousClass5UF(activity);
        r3.A01 = R.drawable.permission_contacts_small;
        r3.A0D = new String[]{"android.permission.GET_ACCOUNTS", "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"};
        r3.A02 = i;
        r3.A0B = null;
        r3.A03 = i2;
        r3.A09 = null;
        activity.startActivityForResult(AnonymousClass5UF.A00(r3, z), 150);
    }

    public static void A0e(Activity activity, C69263Wi r10, AnonymousClass5ZR r11, boolean z) {
        boolean z2;
        int i;
        Intent A002;
        AnonymousClass5UF r5;
        boolean z3 = true;
        if (r11.A0D()) {
            z3 = false;
        }
        if (!z || (Build.VERSION.SDK_INT >= 23 ? r11.A02("android.permission.CAMERA") == 0 : r11.A00.A00.checkCallingOrSelfPermission("android.permission.CAMERA") == 0)) {
            z2 = false;
        } else {
            z2 = true;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("request/permission/checkCameraAndMicPermissionsForVoipCall needMicPerm = ");
        A0o.append(z3);
        C18260x0.A1E(", needCameraPerm = ", A0o, z2);
        if (Build.VERSION.SDK_INT >= 23) {
            C72023d3 r1 = C72023d3.A00;
            if (z2) {
                if (z3) {
                    ArrayList newArrayList = C162197rQ.newArrayList((Object[]) new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"});
                    newArrayList.addAll(r1);
                    r5 = new AnonymousClass5UF(activity);
                    r5.A0A = new int[]{R.drawable.permission_mic, R.drawable.permission_plus, R.drawable.permission_cam};
                    r5.A0D = C18300x5.A1b(newArrayList);
                    r5.A02 = R.string.f11nameremoved;
                    r5.A03 = R.string.f11nameremoved;
                } else {
                    r5 = new AnonymousClass5UF(activity);
                    r5.A01 = R.drawable.permission_cam;
                    r5.A02 = R.string.f11nameremoved;
                    r5.A03 = R.string.f11nameremoved;
                    r5.A0D = new String[]{"android.permission.CAMERA"};
                }
                A002 = AnonymousClass5UF.A00(r5, true);
            } else if (z3) {
                ArrayList newArrayList2 = C162197rQ.newArrayList((Object[]) new String[]{"android.permission.RECORD_AUDIO"});
                newArrayList2.addAll(r1);
                AnonymousClass5UF r12 = new AnonymousClass5UF(activity);
                r12.A01 = R.drawable.permission_mic;
                r12.A02 = R.string.f11nameremoved;
                r12.A03 = R.string.f11nameremoved;
                r12.A0D = C18300x5.A1b(newArrayList2);
                A002 = AnonymousClass5UF.A00(r12, true);
            } else {
                return;
            }
            activity.startActivityForResult(A002, 152);
            return;
        }
        if (z2) {
            i = R.string.f11nameremoved;
            if (z3) {
                i = R.string.f11nameremoved;
            }
        } else if (z3) {
            i = R.string.f11nameremoved;
        } else {
            return;
        }
        r10.A0F(i, 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0123  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0f(android.app.Activity r10, X.C69263Wi r11, boolean r12, boolean r13, boolean r14) {
        /*
            r1 = 813(0x32d, float:1.139E-42)
            if (r12 != 0) goto L_0x0009
            if (r13 != 0) goto L_0x0009
            if (r14 != 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "request/permission/requestPermissionsForRecordingPushToVideo needMicPerm = "
            r2.append(r0)
            r2.append(r13)
            java.lang.String r0 = ", needCameraPermission = "
            r2.append(r0)
            r2.append(r12)
            java.lang.String r0 = ", needStoragePermission = "
            X.C18260x0.A1E(r0, r2, r14)
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            r2 = 1
            if (r6 >= r0) goto L_0x0051
            if (r12 == 0) goto L_0x0042
            if (r13 == 0) goto L_0x0039
            r0 = 2131887413(0x7f120535, float:1.9409432E38)
            if (r14 == 0) goto L_0x0035
            r0 = 2131887414(0x7f120536, float:1.9409434E38)
        L_0x0035:
            r11.A0F(r0, r2)
            return
        L_0x0039:
            r0 = 2131887415(0x7f120537, float:1.9409436E38)
            if (r14 == 0) goto L_0x0035
            r0 = 2131887416(0x7f120538, float:1.9409438E38)
            goto L_0x0035
        L_0x0042:
            if (r13 == 0) goto L_0x004d
            r0 = 2131887417(0x7f120539, float:1.940944E38)
            if (r14 == 0) goto L_0x0035
            r0 = 2131887418(0x7f12053a, float:1.9409443E38)
            goto L_0x0035
        L_0x004d:
            r0 = 2131887419(0x7f12053b, float:1.9409445E38)
            goto L_0x0035
        L_0x0051:
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            if (r12 == 0) goto L_0x005c
            java.lang.String r0 = "android.permission.CAMERA"
            r4.add(r0)
        L_0x005c:
            if (r13 == 0) goto L_0x0063
            java.lang.String r0 = "android.permission.RECORD_AUDIO"
            r4.add(r0)
        L_0x0063:
            if (r14 == 0) goto L_0x0070
            java.lang.String[] r0 = X.C107035aa.A04()
            java.util.List r0 = java.util.Arrays.asList(r0)
            r4.addAll(r0)
        L_0x0070:
            int r0 = r4.size()
            java.lang.String[] r3 = new java.lang.String[r0]
            r4.toArray(r3)
            r7 = 33
            r5 = 30
            r8 = 2
            r9 = 0
            if (r12 == 0) goto L_0x00f0
            if (r13 == 0) goto L_0x00d0
            if (r14 == 0) goto L_0x00bd
            r0 = 3
            int[] r4 = new int[r0]
            r0 = 2131233403(0x7f080a7b, float:1.8082943E38)
            r4[r9] = r0
            r0 = 2131233413(0x7f080a85, float:1.8082963E38)
            r4[r2] = r0
            r0 = 2131233415(0x7f080a87, float:1.8082967E38)
            r4[r8] = r0
            r8 = 2131892330(0x7f12186a, float:1.9419405E38)
            if (r6 >= r5) goto L_0x00b4
            r5 = 2131892329(0x7f121869, float:1.9419403E38)
        L_0x009f:
            X.5UF r0 = new X.5UF
            r0.<init>(r10)
            r0.A0A = r4
            r0.A02 = r8
            r0.A03 = r5
            r0.A0D = r3
            android.content.Intent r0 = X.AnonymousClass5UF.A00(r0, r2)
            r10.startActivityForResult(r0, r1)
            return
        L_0x00b4:
            r5 = 2131892332(0x7f12186c, float:1.941941E38)
            if (r6 >= r7) goto L_0x009f
            r5 = 2131892331(0x7f12186b, float:1.9419407E38)
            goto L_0x009f
        L_0x00bd:
            int[] r4 = new int[r8]
            r0 = 2131233403(0x7f080a7b, float:1.8082943E38)
            r4[r9] = r0
            r0 = 2131233413(0x7f080a85, float:1.8082963E38)
            r4[r2] = r0
            r8 = 2131892328(0x7f121868, float:1.9419401E38)
            r5 = 2131892327(0x7f121867, float:1.94194E38)
            goto L_0x009f
        L_0x00d0:
            if (r14 == 0) goto L_0x0112
            int[] r4 = new int[r8]
            r0 = 2131233403(0x7f080a7b, float:1.8082943E38)
            r4[r9] = r0
            r0 = 2131233415(0x7f080a87, float:1.8082967E38)
            r4[r2] = r0
            r8 = 2131892338(0x7f121872, float:1.9419421E38)
            if (r6 >= r5) goto L_0x00e7
            r5 = 2131892337(0x7f121871, float:1.941942E38)
            goto L_0x009f
        L_0x00e7:
            r5 = 2131892340(0x7f121874, float:1.9419426E38)
            if (r6 >= r7) goto L_0x009f
            r5 = 2131892339(0x7f121873, float:1.9419423E38)
            goto L_0x009f
        L_0x00f0:
            if (r13 == 0) goto L_0x0112
            if (r14 == 0) goto L_0x0112
            int[] r4 = new int[r8]
            r0 = 2131233413(0x7f080a85, float:1.8082963E38)
            r4[r9] = r0
            r0 = 2131233415(0x7f080a87, float:1.8082967E38)
            r4[r2] = r0
            r8 = 2131892401(0x7f1218b1, float:1.941955E38)
            if (r6 >= r5) goto L_0x0109
            r5 = 2131892400(0x7f1218b0, float:1.9419547E38)
            goto L_0x009f
        L_0x0109:
            r5 = 2131892403(0x7f1218b3, float:1.9419553E38)
            if (r6 >= r7) goto L_0x009f
            r5 = 2131892402(0x7f1218b2, float:1.9419551E38)
            goto L_0x009f
        L_0x0112:
            int[] r4 = new int[r2]
            if (r12 == 0) goto L_0x0123
            r0 = 2131233403(0x7f080a7b, float:1.8082943E38)
            r4[r9] = r0
            r8 = 2131892336(0x7f121870, float:1.9419417E38)
            r5 = 2131892335(0x7f12186f, float:1.9419415E38)
            goto L_0x009f
        L_0x0123:
            if (r13 == 0) goto L_0x0132
            r0 = 2131233413(0x7f080a85, float:1.8082963E38)
            r4[r9] = r0
            r8 = 2131892399(0x7f1218af, float:1.9419545E38)
            r5 = 2131892398(0x7f1218ae, float:1.9419543E38)
            goto L_0x009f
        L_0x0132:
            r0 = 2131233415(0x7f080a87, float:1.8082967E38)
            r4[r9] = r0
            r8 = 2131892521(0x7f121929, float:1.9419793E38)
            if (r6 >= r5) goto L_0x0141
            r5 = 2131892520(0x7f121928, float:1.941979E38)
            goto L_0x009f
        L_0x0141:
            r5 = 2131892523(0x7f12192b, float:1.9419797E38)
            if (r6 >= r7) goto L_0x009f
            r5 = 2131892522(0x7f12192a, float:1.9419795E38)
            goto L_0x009f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.RequestPermissionActivity.A0f(android.app.Activity, X.3Wi, boolean, boolean, boolean):void");
    }

    public static void A0g(Activity activity, AnonymousClass5ZR r8) {
        Intent A002;
        if (activity.isFinishing()) {
            Log.d("request/permission/activity/sms passed activity is finishing: do nothing");
            return;
        }
        boolean z = true;
        if (r8.A02("android.permission.SEND_SMS") == 0) {
            z = false;
        }
        boolean z2 = !r8.A0F();
        if (!z) {
            AnonymousClass5UF r2 = new AnonymousClass5UF(activity);
            r2.A01 = R.drawable.permission_call;
            r2.A0D = (String[]) AnonymousClass5ZR.A00().toArray(new String[0]);
            r2.A02 = R.string.f11nameremoved;
            r2.A03 = R.string.f11nameremoved;
            A002 = AnonymousClass5UF.A00(r2, false);
        } else if (z2) {
            ArrayList A0s = C18300x5.A0s("android.permission.SEND_SMS");
            A0s.addAll(AnonymousClass5ZR.A00());
            AnonymousClass5UF r5 = new AnonymousClass5UF(activity);
            r5.A0A = new int[]{R.drawable.permission_sms, R.drawable.permission_plus, R.drawable.permission_call};
            r5.A0D = C18300x5.A1b(A0s);
            r5.A02 = R.string.f11nameremoved;
            r5.A03 = R.string.f11nameremoved;
            A002 = AnonymousClass5UF.A00(r5, false);
        } else {
            AnonymousClass5UF r1 = new AnonymousClass5UF(activity);
            r1.A01 = R.drawable.permission_sms;
            r1.A0D = new String[]{"android.permission.SEND_SMS"};
            r1.A02 = R.string.f11nameremoved;
            r1.A03 = R.string.f11nameremoved;
            A002 = AnonymousClass5UF.A00(r1, false);
        }
        activity.startActivityForResult(A002, 153);
    }

    public static boolean A0m(Activity activity, AnonymousClass5ZR r6) {
        if (r6.A0E()) {
            return true;
        }
        int i = Build.VERSION.SDK_INT;
        int i2 = R.string.f11nameremoved;
        if (i < 30) {
            i2 = R.string.f11nameremoved;
        }
        activity.startActivityForResult(A0C(activity, R.string.f11nameremoved, i2, false), 151);
        return false;
    }

    public static boolean A0n(Activity activity, AnonymousClass5ZR r4, int i, int i2, int i3) {
        String[] strArr = C622534h.A09;
        if (r4.A05()) {
            return true;
        }
        AnonymousClass5UF r1 = new AnonymousClass5UF(activity);
        r1.A01 = R.drawable.permission_location;
        r1.A0D = strArr;
        r1.A03 = i2;
        r1.A02 = i;
        activity.startActivityForResult(r1.A02(), i3);
        return false;
    }

    public static boolean A0o(Activity activity, String str, int[] iArr, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        String[] strArr;
        if (z) {
            if (z2) {
                ArrayList A0s = AnonymousClass001.A0s();
                A0s.add("android.permission.GET_ACCOUNTS");
                A0s.add("android.permission.READ_CONTACTS");
                A0s.add("android.permission.WRITE_CONTACTS");
                strArr = C107035aa.A06(A0s);
            } else {
                strArr = C107035aa.A04();
            }
        } else if (z2) {
            strArr = new String[]{"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS", "android.permission.GET_ACCOUNTS"};
        } else {
            strArr = null;
        }
        if (strArr == null) {
            return true;
        }
        int length = iArr.length;
        AnonymousClass5UF r1 = new AnonymousClass5UF(activity);
        if (length == 1) {
            r1.A01 = iArr[0];
        } else {
            r1.A0A = iArr;
        }
        r1.A0D = strArr;
        r1.A02 = i3;
        r1.A04 = i2;
        r1.A00 = i4;
        Intent A002 = AnonymousClass5UF.A00(r1, true);
        A002.putExtra("permission_requester_screen", str);
        activity.startActivityForResult(A002, i);
        return false;
    }

    public static boolean A0s(C08310eF r6, AnonymousClass5ZR r7) {
        if (r7.A0E()) {
            return true;
        }
        Context A1D = r6.A1D();
        int i = Build.VERSION.SDK_INT;
        int i2 = R.string.f11nameremoved;
        if (i < 30) {
            i2 = R.string.f11nameremoved;
        }
        r6.startActivityForResult(A0C(A1D, R.string.f11nameremoved, i2, false), 151);
        return false;
    }

    public final String A6D(Bundle bundle, boolean z) {
        String str;
        String str2;
        String string = bundle.getString("formatted_message_html");
        if (string != null) {
            return string;
        }
        if (z) {
            str = "perm_denial_message_id";
        } else {
            str = "message_id";
        }
        int i = bundle.getInt(str);
        if (i == 0) {
            return null;
        }
        if (z) {
            str2 = "perm_denial_message_params_id";
        } else {
            str2 = "message_params_id";
        }
        int[] intArray = bundle.getIntArray(str2);
        if (intArray == null) {
            return getString(i);
        }
        int length = intArray.length;
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            strArr[i2] = getString(intArray[i2]);
        }
        return getString(i, strArr);
    }

    public void A6E(String str, Bundle bundle) {
        if (str != null) {
            TextView A012 = C005205m.A01(this, R.id.permission_message);
            if (bundle.getString("formatted_message_html") != null) {
                Context context = A012.getContext();
                Spannable spannable = (Spannable) AnonymousClass0x9.A0B(str);
                for (URLSpan uRLSpan : C86624Kv.A1b(spannable)) {
                    spannable.setSpan(new AnonymousClass4N3(context, uRLSpan.getURL()), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), spannable.getSpanFlags(uRLSpan));
                    spannable.removeSpan(uRLSpan);
                }
                A012.setText(spannable);
                C18270x1.A0q(A012, this.A05);
                A012.setFocusable(true);
                A012.setClickable(true);
                return;
            }
            A012.setText(str);
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("request/permission/activity/there is no message id for ");
        C18260x0.A1K(A0o, Arrays.toString(bundle.getStringArray("permissions")));
        finish();
    }

    public static void A0h(Activity activity, AnonymousClass5ZR r5, int i, boolean z) {
        int i2;
        if (activity.isFinishing()) {
            Log.d("request/permission/activity/flash_call activity is finishing: do nothing");
        } else if (!r5.A0B()) {
            ArrayList A0s = AnonymousClass001.A0s();
            A0s.addAll(AnonymousClass5ZR.A00());
            AnonymousClass5UF r2 = new AnonymousClass5UF(activity);
            if (Build.VERSION.SDK_INT >= 28) {
                A0s.add("android.permission.READ_CALL_LOG");
                A0s.add("android.permission.ANSWER_PHONE_CALLS");
                r2.A0D = C18300x5.A1b(A0s);
                r2.A02 = R.string.f11nameremoved;
                i2 = R.string.f11nameremoved;
            } else {
                A0s.add("android.permission.CALL_PHONE");
                r2.A0D = C18300x5.A1b(A0s);
                r2.A02 = R.string.f11nameremoved;
                i2 = R.string.f11nameremoved;
            }
            r2.A03 = i2;
            r2.A04 = R.string.f11nameremoved;
            r2.A07 = true;
            r2.A07 = true;
            r2.A08 = z;
            activity.startActivityForResult(r2.A02(), i);
        }
    }

    public static void A0i(Activity activity, AnonymousClass1VX r2, int i) {
        if (activity.isFinishing()) {
            Log.d("request/permission/activity/storage passed activity is finishing: do nothing");
        } else {
            activity.startActivityForResult(A0X(activity, r2, AnonymousClass73T.A00()), i);
        }
    }

    public static void A0j(C08310eF r6, int i, int i2) {
        if (r6.A1D() == null) {
            Log.d("request/permission/activity/contacts passed activity is finishing: do nothing");
            return;
        }
        AnonymousClass5UF r3 = new AnonymousClass5UF(r6.A1D());
        r3.A01 = R.drawable.permission_contacts_small;
        r3.A0D = new String[]{"android.permission.GET_ACCOUNTS", "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"};
        r3.A02 = i;
        r3.A0B = null;
        r3.A03 = i2;
        r3.A09 = null;
        r6.startActivityForResult(AnonymousClass5UF.A00(r3, false), 150);
    }

    public static void A0k(C08310eF r4, AnonymousClass33p r5, String[] strArr) {
        A0l(r5, strArr);
        if (r4.A0G != null) {
            C08270df A0U = r4.A0U();
            if (A0U.A02 != null) {
                A0U.A0D.addLast(new C06740Za(r4.A0V, 100));
                A0U.A02.A00((C05880Vi) null, strArr);
                return;
            }
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Fragment ");
        A0o.append(r4);
        throw AnonymousClass000.A0I(" not attached to Activity", A0o);
    }

    public static boolean A0q(Context context, AnonymousClass5ZR r3, AnonymousClass1VX r4) {
        if (!(!r3.A0C())) {
            return true;
        }
        context.startActivity(A0X(context, r4, AnonymousClass73T.A00()));
        return false;
    }

    public static boolean A0r(Context context, AnonymousClass5ZR r5, AnonymousClass1VX r6) {
        int i;
        if (C107385bE.A08() || r5.A0E()) {
            return true;
        }
        if (!C107385bE.A08()) {
            i = R.string.f11nameremoved;
        } else {
            boolean A0A2 = C107385bE.A0A();
            i = R.string.f11nameremoved;
            if (!A0A2) {
                i = R.string.f11nameremoved;
            }
        }
        context.startActivity(A0Y(context, r6, R.string.f11nameremoved, i));
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d2, code lost:
        if (r1 != false) goto L_0x00d4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            super.onCreate(r10)
            android.os.Bundle r6 = X.C86614Ku.A0D(r9)
            if (r6 != 0) goto L_0x0012
            java.lang.String r0 = "request/permission/activity/extra is null"
        L_0x000b:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r9.finish()
        L_0x0011:
            return
        L_0x0012:
            java.lang.String r0 = "permission_requester_screen"
            java.lang.String r0 = r6.getString(r0)
            r9.A08 = r0
            java.lang.String r0 = "permissions"
            java.lang.String[] r4 = r6.getStringArray(r0)
            if (r4 != 0) goto L_0x0025
            java.lang.String r0 = "request/permission/activity/no-permissions-passed"
            goto L_0x000b
        L_0x0025:
            java.lang.String r0 = "title_id"
            int r2 = r6.getInt(r0)
            r0 = 2131102197(0x7f0609f5, float:1.7816825E38)
            int r3 = X.AnonymousClass0Y8.A04(r9, r0)
            android.view.Window r0 = r9.getWindow()
            X.C86644Kx.A17(r0, r3)
            X.AnonymousClass4SG.A37(r9)
            android.view.Window r1 = r9.getWindow()
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r1.clearFlags(r0)
            r0 = 2130969950(0x7f04055e, float:1.7548596E38)
            int r0 = X.AnonymousClass34K.A01(r9, r0)
            int r1 = X.AnonymousClass0Y8.A04(r9, r0)
            r0 = 1050253722(0x3e99999a, float:0.3)
            int r1 = X.AnonymousClass0YI.A03(r0, r3, r1)
            android.view.Window r0 = r9.getWindow()
            r0.setStatusBarColor(r1)
            r0 = 2131625734(0x7f0e0706, float:1.8878684E38)
            r9.setContentView((int) r0)
            r7 = 2131428506(0x7f0b049a, float:1.8478658E38)
            android.view.View r0 = X.C005205m.A00(r9, r7)
            r8 = 2
            X.C989453v.A00(r0, r9, r8)
            r3 = 0
            if (r2 == 0) goto L_0x007f
            r1 = 2131432388(0x7f0b13c4, float:1.8486532E38)
            android.widget.TextView r0 = X.C005205m.A01(r9, r1)
            r0.setText(r2)
            X.C86654Ky.A0s(r9, r1, r3)
        L_0x007f:
            java.lang.String r0 = "drawable_id"
            int r1 = r6.getInt(r0)
            r5 = 1
            if (r1 == 0) goto L_0x014f
            r0 = 2131432384(0x7f0b13c0, float:1.8486524E38)
            android.widget.ImageView r0 = X.C86664Kz.A0u(r9, r0)
            r0.setImageResource(r1)
            r0 = 2131432383(0x7f0b13bf, float:1.8486522E38)
            android.view.View r0 = X.C005205m.A00(r9, r0)
            r1 = 8
            r0.setVisibility(r1)
            r0 = 2131432385(0x7f0b13c1, float:1.8486526E38)
            X.C86654Ky.A0s(r9, r0, r1)
        L_0x00a4:
            java.lang.String r0 = "cancel_button_message_id"
            int r1 = r6.getInt(r0)
            if (r1 == 0) goto L_0x00b3
            android.widget.TextView r0 = X.C005205m.A01(r9, r7)
            r0.setText(r1)
        L_0x00b3:
            if (r10 == 0) goto L_0x00bd
            java.lang.String r0 = "permissions_requested"
            boolean r0 = r10.getBoolean(r0, r3)
            r9.A0B = r0
        L_0x00bd:
            boolean r1 = A0p(r9, r4)
            java.lang.String r0 = "force_ui"
            boolean r0 = r6.getBoolean(r0, r3)
            if (r0 != 0) goto L_0x00d4
            java.lang.String r0 = "perm_denial_message_id"
            int r0 = r6.getInt(r0)
            if (r0 == 0) goto L_0x00d4
            r8 = 0
            if (r1 == 0) goto L_0x00d5
        L_0x00d4:
            r8 = 1
        L_0x00d5:
            X.33p r0 = r9.A04
            boolean r7 = A0t(r0, r4)
            if (r1 != 0) goto L_0x014d
            if (r7 != 0) goto L_0x014d
        L_0x00df:
            java.lang.String r0 = "hide_permissions_rationale"
            boolean r2 = r6.getBoolean(r0, r3)
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "minimal_partial_permissions"
            java.lang.String[] r0 = r1.getStringArrayExtra(r0)
            if (r0 == 0) goto L_0x00f7
            java.util.HashSet r0 = X.C18280x3.A0h(r0)
            r9.A09 = r0
        L_0x00f7:
            java.lang.String r0 = "extra_for_automation"
            boolean r0 = r6.getBoolean(r0, r3)
            r9.A0A = r0
            X.2gq r0 = r9.A06
            r0.A00()
            boolean r0 = r9.A0B
            if (r0 != 0) goto L_0x0181
            if (r8 != 0) goto L_0x010c
            if (r7 != 0) goto L_0x0181
        L_0x010c:
            if (r2 != 0) goto L_0x0181
            java.lang.String r0 = r9.A6D(r6, r5)
            r9.A6E(r0, r6)
            boolean r2 = r9 instanceof com.whatsapp.registration.directmigration.RequestPermissionFromSisterAppActivity
            r0 = 2131434077(0x7f0b1a5d, float:1.8489958E38)
            android.widget.TextView r1 = X.C005205m.A01(r9, r0)
            if (r2 == 0) goto L_0x013b
            r0 = 2131892416(0x7f1218c0, float:1.941958E38)
            r1.setText(r0)
            r0 = 29
            X.C989653x.A00(r1, r9, r0)
        L_0x012b:
            r0 = 2131432387(0x7f0b13c3, float:1.848653E38)
            X.C86654Ky.A0s(r9, r0, r3)
            java.lang.String r1 = r9.A08
            if (r1 == 0) goto L_0x0011
            X.2s5 r0 = r9.A07
            r0.A01(r1)
            return
        L_0x013b:
            if (r5 == 0) goto L_0x0148
            r0 = 2131892416(0x7f1218c0, float:1.941958E38)
            r1.setText(r0)
            r0 = 3
            X.C989453v.A00(r1, r9, r0)
            goto L_0x012b
        L_0x0148:
            r0 = 3
            X.C18320x8.A16(r1, r4, r9, r0)
            goto L_0x012b
        L_0x014d:
            r5 = 0
            goto L_0x00df
        L_0x014f:
            java.lang.String r0 = "drawable_ids"
            int[] r2 = r6.getIntArray(r0)
            if (r2 == 0) goto L_0x00a4
            int r1 = r2.length
            r0 = 3
            if (r1 != r0) goto L_0x00a4
            r0 = 2131432383(0x7f0b13bf, float:1.8486522E38)
            android.widget.ImageView r1 = X.C86664Kz.A0u(r9, r0)
            r0 = r2[r3]
            r1.setImageResource(r0)
            r0 = 2131432384(0x7f0b13c0, float:1.8486524E38)
            android.widget.ImageView r1 = X.C86664Kz.A0u(r9, r0)
            r0 = r2[r5]
            r1.setImageResource(r0)
            r0 = 2131432385(0x7f0b13c1, float:1.8486526E38)
            android.widget.ImageView r1 = X.C86664Kz.A0u(r9, r0)
            r0 = r2[r8]
            r1.setImageResource(r0)
            goto L_0x00a4
        L_0x0181:
            r0 = 1
            r9.A0B = r0
            X.33p r0 = r9.A04
            A0l(r0, r4)
            X.C005205m.A02(r9, r4, r3)
            r0 = 2131432387(0x7f0b13c3, float:1.848653E38)
            X.C86644Kx.A0k(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.RequestPermissionActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        String str;
        String str2;
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 0) {
            setResult(-1);
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (iArr[i2] == 0) {
                    C18260x0.A0K(this.A04, strArr[i2]);
                    if ("android.permission.WRITE_CONTACTS".equals(strArr[i2])) {
                        this.A00.A00(this.A02);
                        this.A01.A05();
                    }
                    Set set = this.A09;
                    if (set != null) {
                        set.remove(strArr[i2]);
                    }
                } else {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("request/permission/activity/");
                    A0o.append(strArr[i2]);
                    C18260x0.A1L(A0o, " denied");
                    if (this.A09 == null) {
                        setResult(0);
                    }
                }
                if (this.A08 != null) {
                    String str3 = strArr[i2];
                    boolean A1T = AnonymousClass000.A1T(iArr[i2]);
                    if ("android.permission.WRITE_CONTACTS".equals(str3)) {
                        str = "access_to_contacts";
                    } else if ("android.permission.WRITE_EXTERNAL_STORAGE".equals(str3)) {
                        str = "access_to_files";
                    }
                    if (A1T) {
                        str2 = "allow";
                    } else {
                        str2 = "not_now";
                    }
                    this.A07.A03(str, str2);
                }
            }
            Set set2 = this.A09;
            if (set2 != null && !set2.isEmpty()) {
                setResult(0);
            }
            finish();
        }
    }

    public void onResume() {
        super.onResume();
        Bundle A0D = C86614Ku.A0D(this);
        C626936e.A06(A0D);
        String[] stringArray = A0D.getStringArray("permissions");
        if (stringArray != null) {
            if (this instanceof RequestPermissionFromSisterAppActivity) {
                int length = stringArray.length;
                int i = 0;
                while (i < length) {
                    if (AnonymousClass5ZR.A01(this, stringArray[i])) {
                        i++;
                    } else {
                        return;
                    }
                }
            } else {
                int length2 = stringArray.length;
                int i2 = 0;
                while (i2 < length2) {
                    String str = stringArray[i2];
                    if (this.A03.A02(str) == 0) {
                        C18260x0.A0K(this.A04, str);
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        }
        if (!this.A0A) {
            Log.i("request/permission/activity/permissions has been granted while we were paused");
            C18290x4.A18(this);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("permissions_requested", this.A0B);
    }
}

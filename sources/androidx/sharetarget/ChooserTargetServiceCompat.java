package androidx.sharetarget;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0KZ;
import X.AnonymousClass0SY;
import X.AnonymousClass0U1;
import X.C03730Li;
import X.C03740Lj;
import X.C10570i9;
import X.C13580nP;
import X.C17890wP;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.service.chooser.ChooserTarget;
import android.service.chooser.ChooserTargetService;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ChooserTargetServiceCompat extends ChooserTargetService {
    public List onGetChooserTargets(ComponentName componentName, IntentFilter intentFilter) {
        IconCompat iconCompat;
        Bitmap bitmap;
        C03730Li r0;
        Context applicationContext = getApplicationContext();
        if (AnonymousClass0SY.A01 == null) {
            synchronized (AnonymousClass0SY.A00) {
                if (AnonymousClass0SY.A01 == null) {
                    ArrayList A0s = AnonymousClass001.A0s();
                    Intent intent = new Intent("android.intent.action.MAIN");
                    intent.addCategory("android.intent.category.LAUNCHER");
                    intent.setPackage(applicationContext.getPackageName());
                    List<ResolveInfo> queryIntentActivities = applicationContext.getPackageManager().queryIntentActivities(intent, 128);
                    if (queryIntentActivities != null) {
                        for (ResolveInfo resolveInfo : queryIntentActivities) {
                            ActivityInfo activityInfo = resolveInfo.activityInfo;
                            Bundle bundle = activityInfo.metaData;
                            if (bundle != null && bundle.containsKey("android.app.shortcuts")) {
                                ArrayList A0s2 = AnonymousClass001.A0s();
                                XmlResourceParser loadXmlMetaData = activityInfo.loadXmlMetaData(applicationContext.getPackageManager(), "android.app.shortcuts");
                                if (loadXmlMetaData == null) {
                                    StringBuilder A0o = AnonymousClass001.A0o();
                                    A0o.append("Failed to open android.app.shortcuts meta-data resource of ");
                                    throw AnonymousClass000.A0F(activityInfo.name, A0o);
                                }
                                while (true) {
                                    try {
                                        int next = loadXmlMetaData.next();
                                        if (next == 1) {
                                            break;
                                        } else if (next == 2 && loadXmlMetaData.getName().equals("share-target")) {
                                            String A00 = AnonymousClass0SY.A00(loadXmlMetaData, "targetClass");
                                            ArrayList A0s3 = AnonymousClass001.A0s();
                                            ArrayList A0s4 = AnonymousClass001.A0s();
                                            while (true) {
                                                int next2 = loadXmlMetaData.next();
                                                if (next2 != 1) {
                                                    if (next2 != 2) {
                                                        if (next2 == 3 && loadXmlMetaData.getName().equals("share-target")) {
                                                            break;
                                                        }
                                                    } else {
                                                        String name = loadXmlMetaData.getName();
                                                        if (name.equals("data")) {
                                                            AnonymousClass0SY.A00(loadXmlMetaData, "scheme");
                                                            AnonymousClass0SY.A00(loadXmlMetaData, "host");
                                                            AnonymousClass0SY.A00(loadXmlMetaData, "port");
                                                            AnonymousClass0SY.A00(loadXmlMetaData, "path");
                                                            AnonymousClass0SY.A00(loadXmlMetaData, "pathPattern");
                                                            AnonymousClass0SY.A00(loadXmlMetaData, "pathPrefix");
                                                            A0s3.add(new AnonymousClass0KZ(AnonymousClass0SY.A00(loadXmlMetaData, "mimeType")));
                                                        } else if (name.equals("category")) {
                                                            A0s4.add(AnonymousClass0SY.A00(loadXmlMetaData, PublicKeyCredentialControllerUtility.JSON_KEY_NAME));
                                                        }
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                            if (A0s3.isEmpty() || A00 == null || A0s4.isEmpty()) {
                                                r0 = null;
                                            } else {
                                                r0 = new C03730Li(A00, (AnonymousClass0KZ[]) A0s3.toArray(new AnonymousClass0KZ[A0s3.size()]), (String[]) A0s4.toArray(new String[A0s4.size()]));
                                            }
                                            if (r0 != null) {
                                                A0s2.add(r0);
                                            }
                                        }
                                    } catch (Exception e) {
                                        Log.e("ShareTargetXmlParser", "Failed to parse the Xml resource: ", e);
                                    }
                                }
                                loadXmlMetaData.close();
                                A0s.addAll(A0s2);
                            }
                        }
                    }
                    AnonymousClass0SY.A01 = A0s;
                }
            }
        }
        ArrayList arrayList = AnonymousClass0SY.A01;
        ArrayList A0s5 = AnonymousClass001.A0s();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C03730Li r4 = (C03730Li) it.next();
            if (r4.A00.equals(componentName.getClassName())) {
                AnonymousClass0KZ[] r3 = r4.A01;
                int length = r3.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (intentFilter.hasDataType(r3[i].A00)) {
                        A0s5.add(r4);
                        break;
                    }
                    i++;
                }
            }
        }
        if (!A0s5.isEmpty()) {
            ShortcutInfoCompatSaverImpl instance = ShortcutInfoCompatSaverImpl.getInstance(applicationContext);
            try {
                List<AnonymousClass0U1> A02 = instance.A02();
                if (A02 != null && !A02.isEmpty()) {
                    ArrayList A0s6 = AnonymousClass001.A0s();
                    for (AnonymousClass0U1 r5 : A02) {
                        Iterator it2 = A0s5.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            C03730Li r42 = (C03730Li) it2.next();
                            if (r5.A0F.containsAll(Arrays.asList(r42.A02))) {
                                A0s6.add(new C10570i9(new ComponentName(applicationContext.getPackageName(), r42.A00), r5));
                                break;
                            }
                        }
                    }
                    if (A0s6.isEmpty()) {
                        return AnonymousClass001.A0s();
                    }
                    Collections.sort(A0s6);
                    ArrayList A0s7 = AnonymousClass001.A0s();
                    int i2 = ((C10570i9) A0s6.get(0)).A01.A02;
                    Iterator it3 = A0s6.iterator();
                    float f = 1.0f;
                    while (it3.hasNext()) {
                        C10570i9 r6 = (C10570i9) it3.next();
                        AnonymousClass0U1 r7 = r6.A01;
                        Icon icon = null;
                        try {
                            C03740Lj r9 = (C03740Lj) instance.A05.submit(new C17890wP(0, r7.A0D, instance)).get();
                            iconCompat = null;
                            if (r9 != null) {
                                String str = r9.A02;
                                if (!TextUtils.isEmpty(str)) {
                                    try {
                                        Context context = instance.A00;
                                        int identifier = context.getResources().getIdentifier(str, (String) null, (String) null);
                                        if (identifier != 0) {
                                            iconCompat = IconCompat.A02(context.getResources(), context.getPackageName(), identifier);
                                        }
                                    } catch (Exception unused) {
                                    }
                                }
                                if (!TextUtils.isEmpty(r9.A01) && (bitmap = (Bitmap) instance.A06.submit(new C13580nP(instance, r9)).get()) != null) {
                                    iconCompat = IconCompat.A03(bitmap);
                                }
                            }
                        } catch (Exception e2) {
                            Log.e("ChooserServiceCompat", "Failed to retrieve shortcut icon: ", e2);
                            iconCompat = null;
                        }
                        Bundle A08 = AnonymousClass002.A08();
                        A08.putString("android.intent.extra.shortcut.ID", r7.A0D);
                        int i3 = r7.A02;
                        if (i2 != i3) {
                            f -= 0.01f;
                            i2 = i3;
                        }
                        CharSequence charSequence = r7.A0B;
                        if (iconCompat != null) {
                            icon = iconCompat.A08();
                        }
                        A0s7.add(new ChooserTarget(charSequence, icon, f, r6.A00, A08));
                    }
                    return A0s7;
                }
            } catch (Exception e3) {
                Log.e("ChooserServiceCompat", "Failed to retrieve shortcuts: ", e3);
                return Collections.emptyList();
            }
        }
        return Collections.emptyList();
    }
}

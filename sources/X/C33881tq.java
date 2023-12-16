package X;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.whatsapp.LegacyMessageDialogFragment;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallLinkInfo;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1tq  reason: invalid class name and case insensitive filesystem */
public class C33881tq extends AnonymousClass5ZM {
    public WeakReference A00;
    public HashMap A01;
    public final Bundle A02;
    public final AnonymousClass5WY A03;
    public final C29441ip A04;
    public final C620633i A05;
    public final AnonymousClass5ZR A06;
    public final C631938h A07;
    public final C53202mi A08;
    public final C56912sl A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public C33881tq(Bundle bundle, C89654ea r3, AnonymousClass5WY r4, C29441ip r5, C620633i r6, AnonymousClass5ZR r7, C631938h r8, C53202mi r9, C56912sl r10, String str, boolean z, boolean z2, boolean z3) {
        super(r3, true);
        this.A00 = AnonymousClass0x9.A14(r3);
        this.A03 = r4;
        this.A05 = r6;
        this.A08 = r9;
        this.A09 = r10;
        this.A04 = r5;
        this.A06 = r7;
        this.A0C = z;
        this.A0B = z2;
        this.A0D = z3;
        this.A0A = str;
        this.A02 = bundle;
        this.A07 = r8;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        int i;
        String str;
        String str2;
        String str3;
        InputStreamReader inputStreamReader;
        if (this.A00.get() != null) {
            i = -1;
            try {
                C56912sl r5 = this.A09;
                HashMap A0t = AnonymousClass001.A0t();
                AnonymousClass4GL A042 = r5.A0F.A04(C58172up.A0G);
                try {
                    int responseCode = ((AnonymousClass3PZ) A042).A01.getResponseCode();
                    if (responseCode != 200) {
                        C18260x0.A0x("RegistrationHttpManager/serverstatus/error status=", AnonymousClass001.A0o(), responseCode);
                    } else {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        InputStream B47 = A042.B47(r5.A04, (Integer) null, AnonymousClass001.A0f());
                        try {
                            inputStreamReader = new InputStreamReader(B47, C58152un.A0B);
                            char[] cArr = new char[ZipDecompressor.UNZIP_BUFFER_SIZE];
                            while (true) {
                                int read = inputStreamReader.read(cArr);
                                if (read < 0) {
                                    break;
                                }
                                A0o.append(cArr, 0, read);
                            }
                            String obj = A0o.toString();
                            inputStreamReader.close();
                            B47.close();
                            JSONObject A1H = AnonymousClass0x9.A1H(obj);
                            Iterator<String> keys = A1H.keys();
                            while (keys.hasNext()) {
                                String A0m = AnonymousClass001.A0m(keys);
                                String string = A1H.getJSONObject(A0m).getString("available");
                                if ("false".equals(string)) {
                                    A0t.put(A0m, Boolean.FALSE);
                                } else if ("true".equals(string)) {
                                    A0t.put(A0m, Boolean.TRUE);
                                } else {
                                    StringBuilder A0o2 = AnonymousClass001.A0o();
                                    A0o2.append("RegistrationHttpManager/serverstatus/error ");
                                    A0o2.append(A0m);
                                    C18260x0.A0r("=", string, A0o2);
                                }
                            }
                        } catch (Throwable th) {
                            B47.close();
                            throw th;
                        }
                    }
                    A042.close();
                    this.A01 = A0t;
                    if (!this.A0C) {
                        try {
                            int i2 = Settings.System.getInt(C620633i.A02(this.A05).A00, "wifi_sleep_policy");
                            if (i2 == 0) {
                                str3 = CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID;
                            } else if (i2 == 1) {
                                str3 = "never-while-plugged";
                            } else if (i2 != 2) {
                                str3 = "unknown";
                            } else {
                                str3 = "never";
                            }
                            C18260x0.A0s("about/wifisleep/", str3, AnonymousClass001.A0o());
                        } catch (Settings.SettingNotFoundException e) {
                            e = e;
                            str2 = "about/wifisleep/not-found";
                            Log.i(str2, e);
                            StringBuilder A0o3 = AnonymousClass001.A0o();
                            A0o3.append("about/contacts/count ");
                            C18260x0.A0o(AnonymousClass25V.A00(this.A05, this.A06), A0o3);
                            i = 0;
                            return Integer.valueOf(i);
                        } catch (Exception e2) {
                            e = e2;
                            str2 = "about/wifisleep/error ";
                            Log.i(str2, e);
                            StringBuilder A0o32 = AnonymousClass001.A0o();
                            A0o32.append("about/contacts/count ");
                            C18260x0.A0o(AnonymousClass25V.A00(this.A05, this.A06), A0o32);
                            i = 0;
                            return Integer.valueOf(i);
                        }
                        StringBuilder A0o322 = AnonymousClass001.A0o();
                        A0o322.append("about/contacts/count ");
                        C18260x0.A0o(AnonymousClass25V.A00(this.A05, this.A06), A0o322);
                    }
                } catch (JSONException e3) {
                    throw new IOException("error parsing json", e3);
                } catch (Throwable th2) {
                    A042.close();
                    throw th2;
                }
            } catch (IOException e4) {
                e = e4;
                str = "checksystemstatus/ioerror ";
                Log.w(str, e);
                this.A01 = null;
                return Integer.valueOf(i);
            } catch (Exception e5) {
                e = e5;
                str = "checksystemstatus/error ";
                Log.w(str, e);
                this.A01 = null;
                return Integer.valueOf(i);
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
        }
        i = 0;
        return Integer.valueOf(i);
        throw th;
    }

    public void A0A() {
        C89654ea A0F = C18320x8.A0F(this.A00);
        if (A0F != null) {
            A0F.Bp9(R.string.f11nameremoved);
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Intent intent;
        String str;
        C50472iE A002;
        C89654ea A0F = C18320x8.A0F(this.A00);
        if (A0F != null && !A0F.BHW()) {
            A0F.BjL();
            int i = null;
            if (!this.A04.A0F()) {
                Log.i("checksystemstatus/no-connectivity");
                A002 = LegacyMessageDialogFragment.A00(new Object[]{A0F.getString(R.string.f11nameremoved)}, R.string.f11nameremoved);
            } else {
                HashMap hashMap = this.A01;
                if (hashMap == null || hashMap.size() == 0) {
                    Log.i("checksystemstatus/no-server-status");
                    if (this.A0C) {
                        A002 = LegacyMessageDialogFragment.A00(new Object[0], R.string.f11nameremoved);
                        A002.A01(new AnonymousClass4I1(0), R.string.f11nameremoved);
                    } else {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        boolean z = this.A0B;
                        if (z) {
                            str = "chat";
                        } else {
                            str = "reg";
                        }
                        A0o.append(str);
                        String A0X = AnonymousClass000.A0X("-unknown", A0o);
                        if (z) {
                            i = 1;
                        }
                        AnonymousClass5WY r9 = this.A03;
                        boolean A003 = this.A08.A00();
                        intent = r9.A00(A0F, this.A02, this.A07, i, this.A0A, A0X, (ArrayList) null, (ArrayList) null, A003);
                    }
                } else {
                    ArrayList A0s = AnonymousClass001.A0s();
                    Iterator A11 = C18290x4.A11(hashMap);
                    boolean z2 = true;
                    boolean z3 = true;
                    while (A11.hasNext()) {
                        Object next = A11.next();
                        if ("version".equals(next)) {
                            z3 = AnonymousClass001.A1Z(C18290x4.A0i(next, this.A01));
                        } else {
                            boolean equals = "email".equals(next);
                            Object A0i = C18290x4.A0i(next, this.A01);
                            if (equals) {
                                z2 = AnonymousClass001.A1Z(A0i);
                            } else if (!AnonymousClass001.A1Z(A0i)) {
                                A0s.add(next);
                            }
                        }
                    }
                    if (A0s.size() != 0 || !z3 || this.A0C) {
                        String str2 = this.A0A;
                        if (this.A0B) {
                            i = 1;
                        }
                        boolean z4 = this.A0C;
                        Bundle bundle = this.A02;
                        intent = C18320x8.A07().setClassName(A0F.getPackageName(), "com.whatsapp.systemstatus.SystemStatusActivity");
                        intent.putExtra("com.whatsapp.SystemStatusActivity.from", str2);
                        intent.putExtra("com.whatsapp.SystemStatusActivity.email", z2);
                        intent.putExtra("com.whatsapp.SystemStatusActivity.version", z3);
                        intent.putStringArrayListExtra("com.whatsapp.SystemStatusActivity.serverfeaturesunavailable", A0s);
                        intent.putExtra("com.whatsapp.SystemStatusActivity.statusonly", z4);
                        if (i != null) {
                            intent.putExtra("com.whatsapp.SystemStatusActivity.type", i);
                        }
                        if (bundle != null) {
                            intent.putExtra("com.whatsapp.SystemStatusActivity.describeProblemBundle", bundle);
                        }
                    } else {
                        if (this.A0B) {
                            i = 1;
                        }
                        AnonymousClass5WY r92 = this.A03;
                        boolean A004 = this.A08.A00();
                        intent = r92.A00(A0F, this.A02, this.A07, i, this.A0A, (String) null, (ArrayList) null, (ArrayList) null, A004);
                    }
                }
                A0F.A6T(intent, this.A0D);
                return;
            }
            A002.A00().A1O(A0F.getSupportFragmentManager(), (String) null);
        }
    }
}

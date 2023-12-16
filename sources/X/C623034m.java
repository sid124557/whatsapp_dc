package X;

import android.content.Context;
import android.net.Uri;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.Me;
import com.whatsapp.R;
import com.whatsapp.privacy.usernotice.UserNoticeContentWorker;
import com.whatsapp.privacy.usernotice.UserNoticeIconWorker;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallLinkInfo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.34m  reason: invalid class name and case insensitive filesystem */
public class C623034m {
    public C53722nY A00;
    public final C56972sr A01;
    public final C54292oU A02;
    public final C57162tC A03;
    public final C620733j A04;
    public final AnonymousClass1VX A05;
    public final C61112zj A06;
    public final C51922kb A07;
    public final C56002rG A08;
    public final AnonymousClass4FS A09;
    public final C34171uL A0A;

    public boolean A08(InputStream inputStream, String str, int i) {
        FileOutputStream A0h;
        try {
            File A012 = A01(this.A02.A00, i);
            if (A012 == null) {
                return false;
            }
            C18260x0.A0y("UserNoticeContentWorker/storeUserNoticeContent/storing user notice for ", AnonymousClass001.A0o(), i);
            A0h = AnonymousClass0x9.A0h(AnonymousClass002.A0A(A012, str));
            C627536m.A0I(inputStream, A0h);
            A0h.close();
            return true;
        } catch (IOException e) {
            Log.e("UserNoticeContentWorker/storeUserNoticeContent/failed to store", e);
            return false;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static AnonymousClass1kU A00(AnonymousClass1VX r11, boolean z) {
        C104635Rt r4;
        int i = 358;
        if (z) {
            i = 357;
        }
        C58422vE r1 = C58422vE.A02;
        int A0O = r11.A0O(r1, i);
        if (A0O == 0) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("GreenAlertUtils/buildModal/dismissible: ");
            A0o.append(z);
            C18260x0.A1L(A0o, ", no start time received");
            return null;
        }
        if (!z) {
            A0O += r11.A0O(r1, 365);
        }
        if (z) {
            r4 = new C104635Rt(new long[]{86400000}, -1);
        } else {
            r4 = null;
        }
        C47462dI r5 = new C47462dI(new C61202zs(r4, new AnonymousClass5RT(C18290x4.A0A(A0O)), (AnonymousClass5RT) null, "onDemand"), "", "", "", "", "");
        if (z) {
            r5.A04 = "";
        }
        return r5.A00();
    }

    public C53722nY A03(C622234e r16) {
        C53722nY r0;
        String str;
        C137376oa r8;
        C622234e r1 = r16;
        int i = r1.A01;
        AnonymousClass1VX r6 = this.A05;
        if (AnonymousClass31f.A00(r6, i)) {
            str = AnonymousClass000.A0Y("UserNoticeContentManager/getUserNoticeContentFromLocal/green alert disabled, notice id: ", AnonymousClass001.A0o(), i);
        } else if (AnonymousClass31f.A01(r6, r1)) {
            C54292oU r3 = this.A02;
            int A0O = r6.A0O(C58422vE.A02, 356);
            if (A0O == 0) {
                Log.i("GreenAlertUtils/buildBanner/no duration received");
                r8 = null;
            } else {
                r8 = new C137376oa(new C61202zs(new C104635Rt((long[]) null, ((long) A0O) * 3600000), new AnonymousClass5RT(1609459200000L), (AnonymousClass5RT) null, "onDemand"), r3.A00.getString(R.string.f11nameremoved));
            }
            AnonymousClass1kU A002 = A00(r6, true);
            AnonymousClass1kU A003 = A00(r6, false);
            if (r8 == null || A002 == null || A003 == null) {
                return null;
            }
            return new C53722nY(r8, A002, A003, (C53012mP) null, CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID, 1, 1);
        } else {
            int i2 = r1.A03;
            int i3 = r1.A00;
            int i4 = 0;
            if (i3 != 0) {
                i4 = 1;
                if (i3 != 1) {
                    i4 = 2;
                    if (i3 != 2) {
                        i4 = 3;
                        if (i3 != 3) {
                            i4 = 4;
                            if (i3 != 4) {
                                i4 = 5;
                                if (i3 != 5) {
                                    i4 = -1;
                                }
                            }
                        }
                    }
                }
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("UserNoticeContentManager/getUserNoticeContentFromLocal/notice id: ");
            A0o.append(i);
            A0o.append(" version: ");
            A0o.append(i2);
            C18260x0.A0y(" stage: ", A0o, i4);
            if (i4 == 5) {
                str = "UserNoticeContentManager/getUserNoticeContentFromLocal/end stage, skip local content";
            } else {
                C53722nY r12 = this.A00;
                if (r12 != null && r12.A00 == i && r12.A01 == i2) {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("UserNoticeContentManager/getUserNoticeContentFromLocal/has content for notice id: ");
                    A0o2.append(i);
                    C18260x0.A0y(" version: ", A0o2, i2);
                    A06(this.A00, i);
                    return this.A00;
                }
                if (A09(new String[]{"content.json"}, i)) {
                    try {
                        FileInputStream A0g = AnonymousClass0x9.A0g(AnonymousClass002.A0A(A01(this.A02.A00, i), "content.json"));
                        try {
                            C61112zj r13 = this.A06;
                            JSONObject A022 = C624535b.A02(A0g);
                            C626936e.A06(A022);
                            C162457s7.A0H(A022);
                            r0 = r13.A01(A022, i);
                        } catch (IOException | JSONException e) {
                            Log.e(C18260x0.A05("Failed to parse user notice content for notice id: ", i), e);
                            r0 = null;
                        } catch (Throwable th) {
                            A0g.close();
                            throw th;
                        }
                        this.A00 = r0;
                        if (r0 != null) {
                            A06(r0, i);
                            C53722nY r7 = this.A00;
                            A0g.close();
                            return r7;
                        }
                        Log.e("UserNoticeContentManager/getUserNoticeContentFromLocal/error parsing");
                        A04(i);
                        this.A07.A02(C18290x4.A0a());
                        A0g.close();
                        return null;
                    } catch (IOException e2) {
                        Log.e("UserNoticeContentManager/getUserNoticeContentFromLocal/exception", e2);
                        return null;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                return null;
            }
        }
        Log.i(str);
        return null;
    }

    public final void A07(C151227Tx r3, String str, String str2, int i) {
        if (r3 != null) {
            String[] A1Z = AnonymousClass0x9.A1Z();
            AnonymousClass000.A16(str, str2, A1Z);
            if (A09(A1Z, i)) {
                File A012 = A01(this.A02.A00, i);
                r3.A01 = AnonymousClass002.A0A(A012, str);
                r3.A00 = AnonymousClass002.A0A(A012, str2);
            }
        }
    }

    public C623034m(C56972sr r1, C54292oU r2, C57162tC r3, C620733j r4, AnonymousClass1VX r5, C61112zj r6, C51922kb r7, C56002rG r8, AnonymousClass4FS r9, C34171uL r10) {
        this.A05 = r5;
        this.A02 = r2;
        this.A01 = r1;
        this.A09 = r9;
        this.A04 = r4;
        this.A0A = r10;
        this.A07 = r7;
        this.A03 = r3;
        this.A08 = r8;
        this.A06 = r6;
    }

    public static final File A01(Context context, int i) {
        File A022 = A02(context.getFilesDir(), "user_notice");
        if (A022 == null) {
            return null;
        }
        return A02(A022, String.valueOf(i));
    }

    public static File A02(File file, String str) {
        File A0A2 = AnonymousClass002.A0A(file, str);
        if (A0A2.exists() || A0A2.mkdir()) {
            return A0A2;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A10(A0A2, "UserNoticeContentManager/getDir/could not make directory ", A0o);
        C18280x3.A13(A0o);
        return null;
    }

    public void A04(int i) {
        C18260x0.A0y("UserNoticeContentManager/deleteUserNoticeData/notice id: ", AnonymousClass001.A0o(), i);
        File A012 = A01(this.A02.A00, i);
        if (A012 != null) {
            this.A09.BkM(C71263bp.A00(A012, 32));
        }
        this.A00 = null;
    }

    public void A05(int i) {
        String str;
        C18260x0.A0y("UserNoticeContentManager/fetchAndStoreUserNoticeContent/notice id ", AnonymousClass001.A0o(), i);
        AnonymousClass0Q9 r8 = new AnonymousClass0Q9();
        r8.A01("notice_id", i);
        Me A002 = C56972sr.A00(this.A01);
        if (A002 == null) {
            C18260x0.A0x("UserNoticeContentManager/fetchAndStoreUserNoticeContent/could not create notice uri for notice id ", AnonymousClass001.A0o(), i);
            return;
        }
        Uri.Builder A003 = C620733j.A00(C18300x5.A0C().authority("whatsapp.com").appendPath("user-notice").appendPath("v1").appendQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID, String.valueOf(i)), A002, this.A04);
        if (AnonymousClass000.A0B(this.A02.A00).densityDpi <= 240) {
            str = "hdpi";
        } else {
            str = "xxhdpi";
        }
        Uri A0H = C18290x4.A0H(A003, "img-size", str);
        StringBuilder A0o = AnonymousClass001.A0o();
        C18260x0.A1J(A0o, C18300x5.A0k(A0H, "UserNoticeContentManager/getUserNoticeUri/uri: ", A0o));
        r8.A00.put("url", A0H.toString());
        AnonymousClass0Xq A004 = r8.A00();
        AnonymousClass0XS A072 = C18270x1.A07();
        AnonymousClass0Aw r1 = new AnonymousClass0Aw(UserNoticeContentWorker.class);
        r1.A06("tag.whatsapp.usernotice.content.fetch");
        r1.A04(A072);
        AnonymousClass0FN r6 = AnonymousClass0FN.EXPONENTIAL;
        TimeUnit timeUnit = TimeUnit.HOURS;
        r1.A03(r6, timeUnit, 1);
        r1.A00.A0B = A004;
        C01460Ay A0I = AnonymousClass0x9.A0I(r1);
        AnonymousClass0Aw r12 = new AnonymousClass0Aw(UserNoticeIconWorker.class);
        r12.A06("tag.whatsapp.usernotice.icon.fetch");
        r12.A04(A072);
        r12.A03(r6, timeUnit, 1);
        C18320x8.A1A(r8, r12);
        C72333dY.A01(this.A0A).A03(C02320Fs.REPLACE, A0I, AnonymousClass000.A0Y("tag.whatsapp.usernotice.content.fetch.", AnonymousClass001.A0o(), i)).A03(AnonymousClass0x9.A0I(r12)).A02();
    }

    public final void A06(C53722nY r4, int i) {
        C18260x0.A0y("UserNoticeContentManager/populateIconFiles/notice id: ", AnonymousClass001.A0o(), i);
        A07(r4.A02, "banner_icon_light.png", "banner_icon_dark.png", i);
        A07(r4.A04, "modal_icon_light.png", "modal_icon_dark.png", i);
        A07(r4.A03, "blocking_modal_icon_light.png", "blocking_modal_icon_dark.png", i);
    }

    public final boolean A09(String[] strArr, int i) {
        File[] listFiles;
        HashSet A0K = AnonymousClass002.A0K();
        Collections.addAll(A0K, strArr);
        File A012 = A01(this.A02.A00, i);
        if (!(A012 == null || (listFiles = A012.listFiles()) == null)) {
            for (File name : listFiles) {
                A0K.remove(name.getName());
            }
        }
        boolean isEmpty = A0K.isEmpty();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UserNoticeContentManager/userNoticeFilesExist/notice id ");
        A0o.append(i);
        C18260x0.A1E(" files exists: ", A0o, isEmpty);
        return isEmpty;
    }
}

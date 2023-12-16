package X;

import android.os.CancellationSignal;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2de  reason: invalid class name and case insensitive filesystem */
public abstract class C47682de {
    public void A00(CancellationSignal cancellationSignal, C50982j5 r15, List list) {
        FileInputStream A0g;
        int i;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            if (!cancellationSignal.isCanceled()) {
                File A01 = r15.A01(A0m);
                if (!A01.exists()) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("EntityTableImporter/Failed to import file '");
                    A0o.append(A0m);
                    C18260x0.A1K(A0o, "'.");
                } else {
                    AnonymousClass2EZ r0 = new AnonymousClass2EZ(new C22181Ii());
                    try {
                        A0g = AnonymousClass0x9.A0g(A01);
                        JSONObject A02 = C624535b.A02(A0g);
                        if (A02 != null) {
                            A0g.close();
                            try {
                                List A00 = r0.A00.A00(A02);
                                if (this instanceof C22161Ig) {
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                C86024In r3 = new C86024In(this, i);
                                if (A00.size() <= 0) {
                                    continue;
                                } else if (!cancellationSignal.isCanceled()) {
                                    int i2 = 0;
                                    while (i2 < A00.size()) {
                                        List<Long> subList = A00.subList(i2, Math.min(A00.size(), i2 + 100));
                                        if (r3.A01 != 0) {
                                            Iterator it2 = subList.iterator();
                                            while (it2.hasNext()) {
                                                long A022 = C18270x1.A02(it2);
                                                C22161Ig r7 = (C22161Ig) r3.A00;
                                                r7.A00.A00.A08(r7.A02, A022);
                                            }
                                            C22161Ig r1 = (C22161Ig) r3.A00;
                                            C622834k r5 = r1.A00.A00;
                                            String str = r1.A02;
                                            String str2 = r1.A01;
                                            if (!subList.isEmpty()) {
                                                C85284Fq A04 = r5.A00.A04();
                                                try {
                                                    StringBuilder A0l = AnonymousClass000.A0l(str2);
                                                    A0l.append(" IN ");
                                                    String A0X = AnonymousClass000.A0X(C57212tH.A00(subList.size()), A0l);
                                                    String[] strArr = new String[subList.size()];
                                                    int i3 = 0;
                                                    for (Long valueOf : subList) {
                                                        strArr[i3] = String.valueOf(valueOf);
                                                        i3++;
                                                    }
                                                    ((AnonymousClass3H0) A04).A03.A07(str, A0X, "BackupChangesStore/DELETE_ENTITIES", strArr);
                                                    A04.close();
                                                } catch (Throwable th) {
                                                    th.addSuppressed(th);
                                                    throw th;
                                                }
                                            }
                                        } else {
                                            Iterator it3 = subList.iterator();
                                            while (it3.hasNext()) {
                                                ((C22151If) r3.A00).A00.A01.A08("message", C18270x1.A02(it3));
                                            }
                                            C47292d1 r6 = ((C22151If) r3.A00).A00;
                                            ArrayList A0I = AnonymousClass002.A0I(100);
                                            Iterator it4 = subList.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    long A023 = C18270x1.A02(it4);
                                                    if (cancellationSignal.isCanceled()) {
                                                        break;
                                                    }
                                                    C624134x A002 = C55122pp.A00(r6.A09, A023);
                                                    if (A002 != null) {
                                                        A0I.add(A002);
                                                    }
                                                } else {
                                                    if (A0I.size() > 0) {
                                                        r6.A05.A0l(A0I, 0);
                                                    }
                                                    Iterator it5 = A0I.iterator();
                                                    while (it5.hasNext()) {
                                                        r6.A04.A01(C18300x5.A0T(it5).A1J);
                                                    }
                                                    Iterator it6 = subList.iterator();
                                                    while (it6.hasNext()) {
                                                        C624134x A003 = C55122pp.A00(r6.A09, C18270x1.A02(it6));
                                                        C43392Ry r52 = r6.A02;
                                                        if (A003 == null) {
                                                            r52.A00++;
                                                        } else {
                                                            r52.A01++;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        i2 += subList.size();
                                    }
                                } else {
                                    return;
                                }
                            } catch (JSONException e) {
                                StringBuilder A0o2 = AnonymousClass001.A0o();
                                throw new IOException(AnonymousClass000.A0V(AnonymousClass0x7.A0p(A01, "JsonEntitiesFileParser/Failed to process JSON file '", A0o2), "'", A0o2), e);
                            }
                        } else {
                            throw new JSONException("Can't read JSON file.");
                        }
                    } catch (JSONException e2) {
                        StringBuilder A0o3 = AnonymousClass001.A0o();
                        throw new IOException(AnonymousClass000.A0V(AnonymousClass0x7.A0p(A01, "JsonEntitiesFileParser/Failed to read JSON with entities from file '", A0o3), "'", A0o3), e2);
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            } else {
                return;
            }
        }
        return;
        throw th;
    }
}

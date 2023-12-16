package X;

import android.text.TextUtils;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2qq  reason: invalid class name and case insensitive filesystem */
public class C55742qq {
    public C33101sR A00;
    public final C04840Qw A01;

    public Object A01(C43982Uf r10, String str) {
        AnonymousClass2IP A002 = A00(str);
        AnonymousClass32G r7 = (AnonymousClass32G) A002.A00.A04(r10.A00());
        if (r7 != null) {
            long j = r7.A01;
            if (j == -1 || System.currentTimeMillis() < r7.A00 + j) {
                Object obj = r7.A02;
                if (obj != null) {
                    return obj;
                }
            } else {
                A04(r10, str);
            }
        }
        return null;
    }

    public void A02(C43982Uf r13, AnonymousClass32G r14, String str) {
        OutputStream outputStream;
        OutputStreamWriter outputStreamWriter;
        String str2;
        String str3 = str;
        A00(str).A00.A08(r13.A00(), r14);
        Object obj = r14.A02;
        if ((obj instanceof String) && r14.A03) {
            C33101sR r0 = this.A00;
            String A002 = r13.A00();
            C49372gQ r4 = r0.A01;
            C172228Ke r1 = r4.A00;
            if (r1 == null) {
                str2 = "BkCacheSaveOnDiskHelper/saveOnDisk disk cache is not setup for bk cache";
            } else if (obj == null) {
                str2 = "BkCacheSaveOnDiskHelper/saveOnDisk invalid value in CacheValue";
            } else {
                try {
                    AnonymousClass7WJ A08 = r1.A08(AnonymousClass000.A0V(":", A002, AnonymousClass000.A0l(str)));
                    String str4 = (String) obj;
                    OutputStreamWriter outputStreamWriter2 = null;
                    try {
                        outputStream = A08.A00();
                        try {
                            outputStreamWriter = new OutputStreamWriter(outputStream, C172228Ke.A0E);
                        } catch (Throwable th) {
                            th = th;
                            C172228Ke.A03(outputStreamWriter2);
                            C172228Ke.A03(outputStream);
                            throw th;
                        }
                        try {
                            outputStreamWriter.write(str4);
                            C172228Ke.A03(outputStreamWriter);
                            C172228Ke.A03(outputStream);
                            A08.A01();
                            r4.A01.put(C18260x0.A06(str, ":", A002), new C45782aZ(r14.A01, str3, r14.A00, A002));
                            r4.A00();
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            outputStreamWriter2 = outputStreamWriter;
                            C172228Ke.A03(outputStreamWriter2);
                            C172228Ke.A03(outputStream);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        outputStream = null;
                        C172228Ke.A03(outputStreamWriter2);
                        C172228Ke.A03(outputStream);
                        throw th;
                    }
                } catch (IOException unused) {
                    Log.e("BkCacheSaveOnDiskHelper/saveOnDisk failed to save the bk-cache");
                    return;
                }
            }
            Log.e(str2);
        }
    }

    public C55742qq(C33101sR r20) {
        String str;
        InputStreamReader inputStreamReader;
        C19360zP r1 = new C19360zP(10);
        this.A01 = r1;
        r1.A00 = new AnonymousClass3XN();
        C33101sR r12 = r20;
        this.A00 = r12;
        r12.A00 = new AnonymousClass2IO(this);
        C49372gQ r13 = r12.A01;
        if (r13.A00 != null) {
            HashMap A0t = AnonymousClass001.A0t();
            try {
                JSONArray jSONArray = new JSONArray(r13.A03.A03("bloks").getString("bk_cache_lookup_map", "{}"));
                for (int i = 0; i < jSONArray.length(); i++) {
                    String obj = jSONArray.get(i).toString();
                    if (!TextUtils.isEmpty(obj)) {
                        try {
                            JSONObject A1H = AnonymousClass0x9.A1H(obj);
                            C45782aZ r122 = new C45782aZ(A1H.getLong("expiration-time"), A1H.getString("shard-key"), A1H.getLong("create-time"), A1H.getString("entry-key"));
                            if (System.currentTimeMillis() > r122.A01 + r122.A00) {
                                StringBuilder A0o = AnonymousClass001.A0o();
                                A0o.append(r122.A03);
                                A0o.append(":");
                                String A0X = AnonymousClass000.A0X(r122.A02, A0o);
                                C172228Ke r3 = r13.A00;
                                if (r3 == null) {
                                    Log.e("BkCacheSaveOnDiskHelper/removeOnDisk disk cache is not setup for bk cache");
                                } else {
                                    try {
                                        r3.A0D(A0X);
                                    } catch (IOException unused) {
                                        Log.e("BkCacheSaveOnDiskHelper/saveOnDisk failed to remove the bk-cache");
                                    }
                                }
                            } else {
                                StringBuilder A0o2 = AnonymousClass001.A0o();
                                A0o2.append(r122.A03);
                                A0o2.append(":");
                                A0t.put(AnonymousClass000.A0X(r122.A02, A0o2), r122);
                            }
                        } catch (JSONException unused2) {
                            Log.e("BkCacheSaveOnDiskHelper:BkCacheValueHelper/fromJsonString threw exception");
                        }
                    }
                }
            } catch (JSONException unused3) {
                Log.e("BkCacheSaveOnDiskHelper/syncLookUpMapToDisk parsing lookUpMap from disk threw exception");
            }
            r13.A01 = A0t;
            r13.A00();
            Iterator A0v = AnonymousClass001.A0v(r13.A01);
            while (A0v.hasNext()) {
                C45782aZ r5 = (C45782aZ) A0v.next();
                try {
                    C172228Ke r4 = r13.A00;
                    StringBuilder A0o3 = AnonymousClass001.A0o();
                    C18290x4.A1R(A0o3, r5.A03);
                    AnonymousClass8KP A09 = r4.A09(AnonymousClass000.A0X(r5.A02, A0o3));
                    if (A09 == null) {
                        Log.i("BkCacheSaveOnDiskHelper/initDiskCache snapshot is null");
                    } else {
                        inputStreamReader = new InputStreamReader(A09.A00[0], C172228Ke.A0E);
                        StringWriter stringWriter = new StringWriter();
                        char[] cArr = new char[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];
                        while (true) {
                            int read = inputStreamReader.read(cArr);
                            if (read == -1) {
                                break;
                            }
                            stringWriter.write(cArr, 0, read);
                        }
                        str = stringWriter.toString();
                        inputStreamReader.close();
                        if (!TextUtils.isEmpty(str)) {
                            A02(new C34271uo(r5, r13), new AnonymousClass32G((Object) str, r5.A01, r5.A00), r5.A03);
                        }
                    }
                } catch (IOException unused4) {
                    Log.e("BkCacheSaveOnDiskHelper/initDiskCache unable to fetch content from disk");
                    str = null;
                } catch (Throwable th) {
                    inputStreamReader.close();
                    throw th;
                }
            }
        }
    }

    public final AnonymousClass2IP A00(String str) {
        AnonymousClass2IP r0;
        C04840Qw r3 = this.A01;
        AnonymousClass2IP r02 = (AnonymousClass2IP) r3.A04(str);
        if (r02 != null) {
            return r02;
        }
        synchronized (r3) {
            r0 = (AnonymousClass2IP) r3.A04(str);
            if (r0 == null) {
                C33101sR r03 = this.A00;
                int A02 = AnonymousClass34G.A02(r03.A02, r03.A03);
                int i = 50;
                if (A02 < 2016) {
                    i = 10;
                    if (A02 >= 2014) {
                        i = 30;
                    }
                }
                r0 = new AnonymousClass2IP(str, i);
                r3.A08(str, r0);
            }
        }
        return r0;
    }

    public void A03(C43982Uf r2, Object obj, String str) {
        A02(r2, new AnonymousClass32G(obj), str);
    }

    public void A04(C43982Uf r6, String str) {
        AnonymousClass2IP r0 = (AnonymousClass2IP) this.A01.A04(str);
        if (r0 != null) {
            r0.A00.A05(r6.A00());
        }
        C33101sR r02 = this.A00;
        String A002 = r6.A00();
        C49372gQ r3 = r02.A01;
        String A0V = AnonymousClass000.A0V(":", A002, AnonymousClass000.A0l(str));
        C172228Ke r03 = r3.A00;
        if (r03 == null) {
            Log.e("BkCacheSaveOnDiskHelper/removeOnDisk disk cache is not setup for bk cache");
        } else {
            try {
                r03.A0D(A0V);
            } catch (IOException unused) {
                Log.e("BkCacheSaveOnDiskHelper/saveOnDisk failed to remove the bk-cache");
            }
        }
        r3.A01.remove(C18260x0.A06(str, ":", A002));
        r3.A00();
    }
}

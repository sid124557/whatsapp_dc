package X;

import android.content.SharedPreferences;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2sp  reason: invalid class name and case insensitive filesystem */
public abstract class C56952sp {
    public Handler A00;
    public C69993Zl A01;
    public AnonymousClass4FV A02;
    public final SharedPreferences A03;
    public final C28811ho A04;
    public final AnonymousClass4FS A05;
    public final C183538qC A06;
    public final ConcurrentHashMap A07 = AnonymousClass0x9.A1D();
    public final ConcurrentHashMap A08 = new ConcurrentHashMap(32);

    public static void A09(C623734t r4, C618832q r5, boolean z, boolean z2) {
        r5.A0F = true;
        r5.A0H = z;
        r5.A0N = z2;
        if (r4.A0J.A0Y(C58422vE.A02, 4921)) {
            r5.A0M = true;
        }
    }

    public synchronized void A0V(SharedPreferences.Editor editor, Set set) {
        editor.putStringSet("ab_props:sys:last_exposure_keys", set);
        editor.apply();
        AnonymousClass4AF r3 = (AnonymousClass4AF) this.A06.get();
        String join = TextUtils.join(",", set);
        C162457s7.A0J(r3, 0);
        C18300x5.A1G(r3, join, 5029);
        r3.Blk(join, 5029, 2);
    }

    public static long A03(C56952sp r3) {
        return ((long) r3.A0O(C58422vE.A02, 1291)) * SearchActionVerificationClientService.MS_TO_NS;
    }

    public static long A04(C56952sp r2, int i) {
        return ((long) r2.A0O(C58422vE.A02, i)) * 1000;
    }

    public static long A05(C56952sp r2, int i) {
        return ((long) r2.A0O(C58422vE.A02, i)) * 60000;
    }

    public static long A06(C56952sp r1, int i) {
        return (long) r1.A0O(C58422vE.A02, i);
    }

    public static Boolean A07(C56952sp r1, int i) {
        return Boolean.valueOf(r1.A0Y(C58422vE.A02, i));
    }

    public static String A08(C56952sp r1, int i) {
        String A0R = r1.A0R(C58422vE.A02, i);
        C162457s7.A0D(A0R);
        return A0R;
    }

    public static void A0A(C56952sp r2, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append("_expo_key");
        r2.A0W(sb.toString());
    }

    public static boolean A0B(WaDialogFragment waDialogFragment) {
        return waDialogFragment.A02.A0Y(C58422vE.A02, 5627);
    }

    public static boolean A0D(C56952sp r2) {
        return r2.A0Y(C58422vE.A02, 4184);
    }

    public static boolean A0E(C56952sp r2) {
        return r2.A0Y(C58422vE.A02, 4465);
    }

    public static boolean A0F(C56952sp r2) {
        return r2.A0Y(C58422vE.A02, 4921);
    }

    public static boolean A0G(C56952sp r2) {
        return r2.A0Y(C58422vE.A02, 5309);
    }

    public static boolean A0H(C56952sp r2) {
        return r2.A0Y(C58422vE.A02, 6261);
    }

    public static boolean A0I(C56952sp r2) {
        return r2.A0Y(C58422vE.A01, 1539);
    }

    public static boolean A0J(C56952sp r1, int i) {
        return !r1.A0Y(C58422vE.A02, i);
    }

    public static boolean A0K(C56952sp r1, int i, boolean z) {
        if (r1.A0Y(C58422vE.A02, i)) {
            return true;
        }
        return z;
    }

    public float A0L(int i) {
        return A0M(C58422vE.A02, i);
    }

    public int A0N(int i) {
        return A0O(C58422vE.A02, i);
    }

    public Object A0P(C58422vE r2, int i) {
        ConcurrentHashMap concurrentHashMap;
        if (this instanceof AnonymousClass1VW) {
            return C18290x4.A0j(((AnonymousClass1VW) this).A02, i);
        }
        if (r2.A00) {
            concurrentHashMap = this.A07;
        } else {
            concurrentHashMap = this.A08;
        }
        return C18290x4.A0j(concurrentHashMap, i);
    }

    public String A0Q(int i) {
        return A0R(C58422vE.A02, i);
    }

    public JSONObject A0S(int i) {
        return A0T(C58422vE.A02, i);
    }

    public void A0U() {
        ConcurrentHashMap concurrentHashMap;
        if (this instanceof AnonymousClass1VW) {
            concurrentHashMap = ((AnonymousClass1VW) this).A02;
        } else {
            concurrentHashMap = this.A08;
        }
        concurrentHashMap.clear();
    }

    public void A0W(String str) {
        C13570nO r1;
        if (!(this instanceof AnonymousClass1VW)) {
            SharedPreferences sharedPreferences = this.A03;
            String string = sharedPreferences.getString(str, (String) null);
            Set<String> stringSet = sharedPreferences.getStringSet("ab_props:sys:last_exposure_keys", (Set) null);
            if (stringSet != null) {
                r1 = new C13570nO(0);
                r1.addAll(stringSet);
            }
            if (!TextUtils.isEmpty(string) && !r1.contains(string)) {
                r1.add(string);
                A0V(sharedPreferences.edit(), r1);
                if (A0Y(C58422vE.A02, 3099)) {
                    if (this.A00 == null) {
                        this.A00 = AnonymousClass000.A0A();
                        this.A01 = new C69993Zl(this, 22);
                    }
                    long millis = TimeUnit.SECONDS.toMillis(A06(this, 3100));
                    this.A00.removeCallbacks(this.A01);
                    this.A00.postDelayed(this.A01, millis);
                }
            }
        }
    }

    public boolean A0X(int i) {
        return A0Y(C58422vE.A02, i);
    }

    public C56952sp(C28811ho r3, C60152y5 r4, AnonymousClass4FS r5, C183538qC r6, String str) {
        this.A05 = r5;
        this.A04 = r3;
        this.A06 = r6;
        this.A03 = r4.A03(str);
    }

    public static boolean A0C(ExpressionsBottomSheetView expressionsBottomSheetView) {
        return expressionsBottomSheetView.getAbProps().A0Y(C58422vE.A02, 5627);
    }

    public float A0M(C58422vE r5, int i) {
        AnonymousClass8OQ r0;
        float f;
        ConcurrentHashMap concurrentHashMap;
        Number number = (Number) A0P(r5, i);
        if (number != null) {
            return number.floatValue();
        }
        synchronized (this) {
            Float f2 = (Float) A0P(r5, i);
            if (f2 != null) {
                f = f2.floatValue();
            } else {
                A0A(this, i);
                if (this instanceof AnonymousClass1VX) {
                    r0 = ((AnonymousClass1VX) this).A01;
                } else {
                    r0 = ((AnonymousClass1VW) this).A00.A01;
                }
                Integer valueOf = Integer.valueOf(i);
                Float f3 = (Float) r0.get(valueOf);
                if (f3 != null) {
                    f = this.A03.getFloat(Integer.toString(i), f3.floatValue());
                    if (this instanceof AnonymousClass1VW) {
                        concurrentHashMap = ((AnonymousClass1VW) this).A02;
                    } else {
                        concurrentHashMap = this.A08;
                    }
                    concurrentHashMap.put(valueOf, Float.valueOf(f));
                } else {
                    throw AnonymousClass000.A0G("Unknown FloatField: ", AnonymousClass001.A0o(), i);
                }
            }
        }
        return f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0067, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0O(X.C58422vE r5, int r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.A0P(r5, r6)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x000d
            int r0 = r0.intValue()
            return r0
        L_0x000d:
            monitor-enter(r4)
            java.lang.Object r0 = r4.A0P(r5, r6)     // Catch:{ all -> 0x0073 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x001c
            int r0 = r0.intValue()     // Catch:{ all -> 0x0073 }
            monitor-exit(r4)     // Catch:{ all -> 0x0073 }
            return r0
        L_0x001c:
            A0A(r4, r6)     // Catch:{ all -> 0x0073 }
            r1 = r4
            boolean r0 = r4 instanceof X.AnonymousClass1VX     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x0060
            X.1VX r1 = (X.AnonymousClass1VX) r1     // Catch:{ all -> 0x0073 }
            X.8OQ r0 = r1.A02     // Catch:{ all -> 0x0073 }
        L_0x0028:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0073 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0073 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x0068
            android.content.SharedPreferences r2 = r4.A03     // Catch:{ all -> 0x0073 }
            java.lang.String r1 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x0073 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0073 }
            int r2 = r2.getInt(r1, r0)     // Catch:{ all -> 0x0073 }
            boolean r0 = r5.A00     // Catch:{ all -> 0x0073 }
            if (r0 != 0) goto L_0x005a
            r1 = r4
            boolean r0 = r4 instanceof X.AnonymousClass1VW     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x0054
            X.1VW r1 = (X.AnonymousClass1VW) r1     // Catch:{ all -> 0x0073 }
            java.util.concurrent.ConcurrentHashMap r0 = r1.A02     // Catch:{ all -> 0x0073 }
            X.AnonymousClass0x2.A1I(r3, r0, r2)     // Catch:{ all -> 0x0073 }
        L_0x0052:
            monitor-exit(r4)     // Catch:{ all -> 0x0073 }
            goto L_0x0067
        L_0x0054:
            java.util.concurrent.ConcurrentHashMap r0 = r4.A08     // Catch:{ all -> 0x0073 }
            X.AnonymousClass0x2.A1I(r3, r0, r2)     // Catch:{ all -> 0x0073 }
            goto L_0x0052
        L_0x005a:
            java.util.concurrent.ConcurrentHashMap r0 = r4.A07     // Catch:{ all -> 0x0073 }
            X.AnonymousClass0x2.A1I(r3, r0, r2)     // Catch:{ all -> 0x0073 }
            goto L_0x0052
        L_0x0060:
            X.1VW r1 = (X.AnonymousClass1VW) r1     // Catch:{ all -> 0x0073 }
            X.1VX r0 = r1.A00     // Catch:{ all -> 0x0073 }
            X.8OQ r0 = r0.A02     // Catch:{ all -> 0x0073 }
            goto L_0x0028
        L_0x0067:
            return r2
        L_0x0068:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0073 }
            java.lang.String r0 = "Unknown IntField: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0G(r0, r1, r6)     // Catch:{ all -> 0x0073 }
            throw r0     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0073 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56952sp.A0O(X.2vE, int):int");
    }

    public final String A0R(C58422vE r4, int i) {
        String str;
        AnonymousClass8OQ r1;
        String str2 = (String) A0P(r4, i);
        if (str2 != null) {
            return str2;
        }
        synchronized (this) {
            str = (String) A0P(r4, i);
            if (str == null) {
                A0A(this, i);
                if (this instanceof AnonymousClass1VX) {
                    r1 = ((AnonymousClass1VX) this).A04;
                } else {
                    r1 = ((AnonymousClass1VW) this).A00.A04;
                }
                String str3 = (String) r1.get(Integer.valueOf(i));
                if (str3 != null) {
                    str = this.A03.getString(Integer.toString(i), str3);
                    if (str != null) {
                        if (this instanceof AnonymousClass1VW) {
                            AnonymousClass0x2.A1H(str, ((AnonymousClass1VW) this).A02, i);
                        } else {
                            AnonymousClass0x2.A1H(str, this.A08, i);
                        }
                    }
                } else {
                    throw AnonymousClass000.A0G("Unknown StringField: ", AnonymousClass001.A0o(), i);
                }
            }
        }
        return str;
    }

    public final JSONObject A0T(C58422vE r7, int i) {
        JSONObject jSONObject;
        AnonymousClass8OQ r1;
        IllegalArgumentException illegalArgumentException;
        JSONObject jSONObject2 = (JSONObject) A0P(r7, i);
        if (jSONObject2 != null) {
            return jSONObject2;
        }
        synchronized (this) {
            jSONObject = (JSONObject) A0P(r7, i);
            if (jSONObject == null) {
                A0A(this, i);
                if (this instanceof AnonymousClass1VX) {
                    r1 = ((AnonymousClass1VX) this).A03;
                } else {
                    r1 = ((AnonymousClass1VW) this).A00.A03;
                }
                String str = (String) r1.get(Integer.valueOf(i));
                if (str != null) {
                    String num = Integer.toString(i);
                    SharedPreferences sharedPreferences = this.A03;
                    String A0Z = C18280x3.A0Z(sharedPreferences, num);
                    if (!TextUtils.isEmpty(A0Z)) {
                        str = A0Z;
                    }
                    try {
                        jSONObject = AnonymousClass0x9.A1H(str);
                        if (this instanceof AnonymousClass1VW) {
                            AnonymousClass0x2.A1H(jSONObject, ((AnonymousClass1VW) this).A02, i);
                        } else {
                            AnonymousClass0x2.A1H(jSONObject, this.A08, i);
                        }
                    } catch (JSONException e) {
                        C18270x1.A0n(sharedPreferences, num);
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("AbstractABProps/invalid json format for property; prefKey=");
                        A0o.append(num);
                        illegalArgumentException = new IllegalArgumentException(AnonymousClass000.A0V("; value=", str, A0o), e);
                    }
                } else {
                    illegalArgumentException = AnonymousClass000.A0G("Unknown JsonField: ", AnonymousClass001.A0o(), i);
                    throw illegalArgumentException;
                }
            }
        }
        return jSONObject;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0067, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0Y(X.C58422vE r5, int r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.A0P(r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x000d
            boolean r0 = r0.booleanValue()
            return r0
        L_0x000d:
            monitor-enter(r4)
            java.lang.Object r0 = r4.A0P(r5, r6)     // Catch:{ all -> 0x0073 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x001c
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0073 }
            monitor-exit(r4)     // Catch:{ all -> 0x0073 }
            return r0
        L_0x001c:
            A0A(r4, r6)     // Catch:{ all -> 0x0073 }
            r1 = r4
            boolean r0 = r4 instanceof X.AnonymousClass1VX     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x0060
            X.1VX r1 = (X.AnonymousClass1VX) r1     // Catch:{ all -> 0x0073 }
            X.8OQ r0 = r1.A00     // Catch:{ all -> 0x0073 }
        L_0x0028:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0073 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0073 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x0068
            android.content.SharedPreferences r2 = r4.A03     // Catch:{ all -> 0x0073 }
            java.lang.String r1 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x0073 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0073 }
            boolean r2 = r2.getBoolean(r1, r0)     // Catch:{ all -> 0x0073 }
            boolean r0 = r5.A00     // Catch:{ all -> 0x0073 }
            if (r0 != 0) goto L_0x005a
            r1 = r4
            boolean r0 = r4 instanceof X.AnonymousClass1VW     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x0054
            X.1VW r1 = (X.AnonymousClass1VW) r1     // Catch:{ all -> 0x0073 }
            java.util.concurrent.ConcurrentHashMap r0 = r1.A02     // Catch:{ all -> 0x0073 }
            X.AnonymousClass000.A1C(r3, r0, r2)     // Catch:{ all -> 0x0073 }
        L_0x0052:
            monitor-exit(r4)     // Catch:{ all -> 0x0073 }
            goto L_0x0067
        L_0x0054:
            java.util.concurrent.ConcurrentHashMap r0 = r4.A08     // Catch:{ all -> 0x0073 }
            X.AnonymousClass000.A1C(r3, r0, r2)     // Catch:{ all -> 0x0073 }
            goto L_0x0052
        L_0x005a:
            java.util.concurrent.ConcurrentHashMap r0 = r4.A07     // Catch:{ all -> 0x0073 }
            X.AnonymousClass000.A1C(r3, r0, r2)     // Catch:{ all -> 0x0073 }
            goto L_0x0052
        L_0x0060:
            X.1VW r1 = (X.AnonymousClass1VW) r1     // Catch:{ all -> 0x0073 }
            X.1VX r0 = r1.A00     // Catch:{ all -> 0x0073 }
            X.8OQ r0 = r0.A00     // Catch:{ all -> 0x0073 }
            goto L_0x0028
        L_0x0067:
            return r2
        L_0x0068:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0073 }
            java.lang.String r0 = "Unknown BooleanField: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0G(r0, r1, r6)     // Catch:{ all -> 0x0073 }
            throw r0     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0073 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56952sp.A0Y(X.2vE, int):boolean");
    }
}

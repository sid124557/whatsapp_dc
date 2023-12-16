package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.SparseArray;
import com.whatsapp.util.Log;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4LX  reason: invalid class name */
public class AnonymousClass4LX extends BroadcastReceiver {
    public final Context A00;
    public final C29401il A01;
    public final C44882Xv A02;
    public final C620633i A03;
    public final AnonymousClass1VX A04;
    public final AnonymousClass4FV A05;

    public final void A02() {
        boolean isPowerSaveMode;
        C620633i r1 = this.A03;
        C620633i.A0P = true;
        PowerManager A0J = r1.A0J();
        C620633i.A0P = false;
        if (A0J == null) {
            Log.w("battery-receiver/on-action-power-save-mode-changed pm=null");
            isPowerSaveMode = true;
        } else {
            isPowerSaveMode = A0J.isPowerSaveMode();
        }
        C44882Xv r2 = this.A02;
        C18260x0.A1D("PowerSaveModeStateProvider/notifyPowerSaveModeChanged: ", AnonymousClass001.A0o(), isPowerSaveMode);
        r2.A01 = Boolean.valueOf(isPowerSaveMode);
    }

    public AnonymousClass4LX(Context context, C29401il r2, C44882Xv r3, C620633i r4, AnonymousClass1VX r5, AnonymousClass4FV r6) {
        this.A00 = context;
        this.A04 = r5;
        this.A05 = r6;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }

    public static Object A00(Object obj) {
        Class<?> cls = obj.getClass();
        if (cls.isPrimitive() || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof CharSequence) || (obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character)) {
            return obj;
        }
        if (cls.isArray()) {
            JSONArray A1F = AnonymousClass0x9.A1F();
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                A1F.put(A00(Array.get(obj, i)));
            }
            return A1F;
        } else if (obj instanceof List) {
            JSONArray A1F2 = AnonymousClass0x9.A1F();
            for (Object A002 : (List) obj) {
                A1F2.put(A00(A002));
            }
            return A1F2;
        } else if (obj instanceof Bundle) {
            return A01((Bundle) obj);
        } else {
            if (obj instanceof SparseArray) {
                SparseArray sparseArray = (SparseArray) obj;
                JSONObject A1G = AnonymousClass0x9.A1G();
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    A1G.put(Integer.toString(sparseArray.keyAt(i2)), A00(sparseArray.valueAt(i2)));
                }
                return A1G;
            }
            JSONObject A1G2 = AnonymousClass0x9.A1G();
            A1G2.put("class", cls.getCanonicalName());
            A1G2.put("string", obj.toString());
            return A1G2;
        }
    }

    public static JSONObject A01(Bundle bundle) {
        JSONObject A1G = AnonymousClass0x9.A1G();
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            Object obj = bundle.get(A0m);
            if (A0m == null) {
                A0m = "null";
            }
            A1G.put(A0m, A00(obj));
        }
        return A1G;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        switch (action.hashCode()) {
            case -1538406691:
                if (action.equals("android.intent.action.BATTERY_CHANGED")) {
                    AnonymousClass30O r2 = new AnonymousClass30O(intent);
                    C29401il r1 = this.A01;
                    if (!r1.A00.equals(r2)) {
                        r1.A00 = r2;
                        Iterator A032 = C61102zi.A03(r1);
                        while (A032.hasNext()) {
                            ((AnonymousClass498) A032.next()).BNW(r2);
                        }
                        C18260x0.A1R(AnonymousClass001.A0o(), "battery changed; newEvent=", r2);
                        return;
                    }
                    return;
                }
                break;
            case -1209048666:
                if (action.equals("com.samsung.android.action.WARNING_NOTIFICATION")) {
                    String str = intent.getPackage();
                    if (str == null || str.equals(context.getPackageName())) {
                        C94474rO r22 = new C94474rO();
                        if (intent.getDataString() != null) {
                            r22.A00 = intent.getDataString();
                        }
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            extras.keySet();
                            try {
                                r22.A01 = extras.toString();
                                r22.A02 = A01(extras).toString();
                            } catch (BadParcelableException | JSONException e) {
                                Log.e("battery-receiver/samsung-warning/unable-to-serialize-extras", e);
                            }
                        }
                        this.A05.BhD(r22);
                        return;
                    }
                    return;
                }
                break;
            case 1779291251:
                if (action.equals("android.os.action.POWER_SAVE_MODE_CHANGED")) {
                    A02();
                    return;
                }
                break;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Unexpected action: ");
        throw AnonymousClass000.A0F(intent.getAction(), A0o);
    }
}

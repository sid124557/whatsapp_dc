package X;

import android.os.Bundle;
import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.fieldstats.extension.WamCallExtended;
import com.whatsapp.fieldstats.extension.WamCallExtendedField;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.5Z0  reason: invalid class name */
public class AnonymousClass5Z0 {
    public final C64723Er A00;
    public final AnonymousClass4FV A01;
    public final C187958y5 A02;

    public void A02(WamCall wamCall, boolean z) {
        long j;
        this.A00.A01 = wamCall;
        Long l = wamCall.logSampleRatio;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 1;
        }
        wamCall.logSampleRatio = null;
        AnonymousClass4FV r1 = this.A01;
        r1.BhE(wamCall, (int) j);
        if (z) {
            r1.BKX();
        }
    }

    public AnonymousClass5Z0(C64723Er r1, AnonymousClass4FV r2, C187958y5 r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public static Bundle A00(Object obj) {
        Bundle A08 = AnonymousClass002.A08();
        Class<?> cls = obj.getClass();
        Field[] declaredFields = cls.getDeclaredFields();
        ArrayList A0s = AnonymousClass001.A0s();
        if (WamCallExtended.class == cls && cls.getSuperclass() != null) {
            Collections.addAll(A0s, cls.getSuperclass().getDeclaredFields());
        }
        Collections.addAll(A0s, declaredFields);
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            Field field = (Field) it.next();
            int modifiers = field.getModifiers();
            if (Modifier.isPublic(modifiers) && !Modifier.isStatic(modifiers)) {
                String name = field.getName();
                try {
                    Object obj2 = field.get(obj);
                    if (obj2 != null) {
                        if (obj2 instanceof Double) {
                            A08.putDouble(name, ((Number) obj2).doubleValue());
                        } else if (obj2 instanceof Integer) {
                            A08.putInt(name, AnonymousClass001.A0K(obj2));
                        } else if (obj2 instanceof Long) {
                            A08.putLong(name, C18310x6.A0B(obj2));
                        } else if (obj2 instanceof Boolean) {
                            A08.putBoolean(name, AnonymousClass001.A1Z(obj2));
                        } else if (obj2 instanceof String) {
                            A08.putString(name, (String) obj2);
                        } else if (!name.equals("fields") || !(obj2 instanceof ArrayList)) {
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append("unexpected member ");
                            A0o.append(name);
                            A0o.append(" in fieldstats event, only Double, Integer, and String members are supported");
                            C18270x1.A0z(A0o);
                        } else {
                            ArrayList A0s2 = AnonymousClass001.A0s();
                            Iterator it2 = ((AbstractCollection) obj2).iterator();
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                if (next instanceof WamCallExtendedField) {
                                    A0s2.add(next);
                                }
                            }
                            A08.putParcelableArrayList(name, A0s2);
                        }
                    }
                } catch (IllegalAccessException e) {
                    throw new IllegalArgumentException(e);
                }
            }
        }
        return A08;
    }

    public static void A01(Bundle bundle, Object obj) {
        Class<?> cls = obj.getClass();
        Field[] declaredFields = cls.getDeclaredFields();
        ArrayList A0s = AnonymousClass001.A0s();
        if (WamCallExtended.class == cls && cls.getSuperclass() != null) {
            Collections.addAll(A0s, cls.getSuperclass().getDeclaredFields());
        }
        Collections.addAll(A0s, declaredFields);
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            Field field = (Field) it.next();
            int modifiers = field.getModifiers();
            if (Modifier.isPublic(modifiers) && !Modifier.isStatic(modifiers) && !Modifier.isFinal(modifiers)) {
                String name = field.getName();
                C626936e.A06(bundle);
                try {
                    field.set(obj, bundle.get(name));
                } catch (IllegalAccessException e) {
                    throw new IllegalArgumentException(e);
                }
            }
        }
    }
}

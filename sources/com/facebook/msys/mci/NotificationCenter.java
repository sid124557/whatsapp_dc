package com.facebook.msys.mci;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass6C7;
import X.AnonymousClass6Mq;
import X.AnonymousClass7FZ;
import X.C156007fs;
import X.C180418l0;
import X.C18260x0;
import X.C626936e;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class NotificationCenter {
    public static final String TAG = "NotificationCenter";
    public final Set mMainConfig;
    public NativeHolder mNativeHolder;
    public final Map mNativeScopeToJavaScope;
    public final Map mObserverConfigs;

    public interface NotificationCallback {
        void onNewNotification(String str, C180418l0 r2, Map map);
    }

    private native void addObserverNative(String str, int i);

    private native NativeHolder initNativeHolder();

    private native void removeObserverNative(String str);

    private boolean scopeExistInAnyConfig(C180418l0 r4) {
        if (r4 != null) {
            Iterator A0q = AnonymousClass000.A0q(this.mObserverConfigs);
            while (A0q.hasNext()) {
                if (((C156007fs) AnonymousClass0x2.A0W(A0q)).A00.containsKey(r4)) {
                    return true;
                }
            }
        }
        return false;
    }

    public synchronized void addObserver(NotificationCallback notificationCallback, String str, int i, C180418l0 r5) {
        notificationCallback.getClass();
        str.getClass();
        if (!observerHasConfig(notificationCallback, str, r5)) {
            if (r5 != null) {
                addScopeToMappingOfNativeToJava(r5);
            }
            addObserverConfig(notificationCallback, str, r5);
            if (this.mMainConfig.add(str)) {
                addObserverNative(str, i);
            }
        }
    }

    public synchronized void removeEveryObserver(NotificationCallback notificationCallback) {
        C156007fs r5;
        C626936e.A06(notificationCallback);
        C156007fs r7 = (C156007fs) this.mObserverConfigs.get(notificationCallback);
        if (r7 != null) {
            AnonymousClass7FZ r6 = new AnonymousClass7FZ(notificationCallback, this);
            synchronized (r7) {
                HashSet A15 = AnonymousClass0x9.A15(r7.A01);
                HashMap A0t = AnonymousClass001.A0t();
                Iterator A0q = AnonymousClass000.A0q(r7.A00);
                while (A0q.hasNext()) {
                    Map.Entry A0w = AnonymousClass001.A0w(A0q);
                    A0t.put((C180418l0) A0w.getKey(), AnonymousClass0x9.A15((Collection) A0w.getValue()));
                }
                r5 = new C156007fs(A0t, A15);
            }
            Iterator it = r5.A01.iterator();
            while (it.hasNext()) {
                r6.A01.removeObserver(r6.A00, AnonymousClass001.A0m(it), (C180418l0) null);
            }
            Iterator A0q2 = AnonymousClass000.A0q(r5.A00);
            while (A0q2.hasNext()) {
                Map.Entry A0w2 = AnonymousClass001.A0w(A0q2);
                C180418l0 r4 = (C180418l0) A0w2.getKey();
                Iterator it2 = ((Set) A0w2.getValue()).iterator();
                while (it2.hasNext()) {
                    r6.A01.removeObserver(r6.A00, AnonymousClass001.A0m(it2), r4);
                }
            }
            this.mObserverConfigs.remove(notificationCallback);
        }
    }

    public synchronized void removeObserver(NotificationCallback notificationCallback, String str, C180418l0 r4) {
        C626936e.A06(notificationCallback);
        C626936e.A06(str);
        if (observerHasConfig(notificationCallback, str, r4)) {
            removeObserverConfig(notificationCallback, str, r4);
            if (r4 != null && !scopeExistInAnyConfig(r4)) {
                removeScopeFromNativeToJavaMappings(r4);
            }
            if (!notificationNameExistsInSomeObserver(str)) {
                this.mMainConfig.remove(str);
                removeObserverNative(str);
            }
        }
    }

    private boolean addObserverConfig(NotificationCallback notificationCallback, String str, C180418l0 r5) {
        Set set;
        C156007fs r1 = (C156007fs) this.mObserverConfigs.get(notificationCallback);
        if (r1 == null) {
            r1 = new C156007fs();
            this.mObserverConfigs.put(notificationCallback, r1);
        }
        if (r5 == null) {
            set = r1.A01;
        } else {
            Map map = r1.A00;
            set = (Set) map.get(r5);
            if (set == null) {
                set = AnonymousClass002.A0K();
                map.put(r5, set);
            }
        }
        return set.add(str);
    }

    private void addScopeToMappingOfNativeToJava(C180418l0 r4) {
        this.mNativeScopeToJavaScope.put(Long.valueOf(r4.getNativeReference()), r4);
    }

    private void dispatchNotificationToCallbacks(String str, Long l, Object obj) {
        C180418l0 r4;
        String str2;
        int i;
        Set set;
        if (obj == null || (obj instanceof Map)) {
            Map map = (Map) obj;
            ArrayList A0s = AnonymousClass001.A0s();
            synchronized (this) {
                if (l != null) {
                    r4 = (C180418l0) this.mNativeScopeToJavaScope.get(l);
                } else {
                    r4 = null;
                }
                Iterator A0q = AnonymousClass000.A0q(this.mObserverConfigs);
                while (true) {
                    str2 = str;
                    if (!A0q.hasNext()) {
                        break;
                    }
                    Map.Entry A0w = AnonymousClass001.A0w(A0q);
                    C156007fs r1 = (C156007fs) A0w.getValue();
                    if (r1.A01.contains(str) || ((set = (Set) r1.A00.get(r4)) != null && set.contains(str))) {
                        A0s.add((NotificationCallback) A0w.getKey());
                    }
                }
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("NotificationCenterGet notification ");
            A0o.append(str);
            A0o.append(" with scope ");
            A0o.append(r4);
            A0o.append(" and payload ");
            A0o.append(obj);
            C18260x0.A1P(A0o, ", dispatching to ", A0s);
            if (!A0s.isEmpty()) {
                AnonymousClass6Mq r3 = new AnonymousClass6Mq(r4, this, str2, A0s, map);
                if (str.equals("MCDDatabaseCommitNotificationV2")) {
                    i = Execution.getExecutionContext();
                } else {
                    i = 1;
                }
                Execution.executePossiblySync(r3, i);
                return;
            }
            return;
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        C18260x0.A1T(A0o2, "Native layer of msys reported a notification whose payload could not be serialized into a Java Map. Instead, it's of type ", obj);
        throw AnonymousClass6C7.A0e(A0o2);
    }

    private boolean notificationNameExistsInSomeObserver(String str) {
        Iterator A0q = AnonymousClass000.A0q(this.mObserverConfigs);
        while (A0q.hasNext()) {
            C156007fs r1 = (C156007fs) AnonymousClass0x2.A0W(A0q);
            if (r1.A01.contains(str)) {
                return true;
            }
            Iterator A0q2 = AnonymousClass000.A0q(r1.A00);
            while (true) {
                if (A0q2.hasNext()) {
                    if (((Set) AnonymousClass0x2.A0W(A0q2)).contains(str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean observerHasConfig(NotificationCallback notificationCallback, String str, C180418l0 r4) {
        Set set;
        C156007fs r0 = (C156007fs) this.mObserverConfigs.get(notificationCallback);
        if (r0 == null) {
            return false;
        }
        if (r4 == null) {
            set = r0.A01;
        } else {
            set = (Set) r0.A00.get(r4);
            if (set == null) {
                return false;
            }
        }
        return set.contains(str);
    }

    private boolean removeObserverConfig(NotificationCallback notificationCallback, String str, C180418l0 r7) {
        boolean z;
        C156007fs r3 = (C156007fs) this.mObserverConfigs.get(notificationCallback);
        if (r3 == null) {
            return false;
        }
        if (r7 == null) {
            z = r3.A01.remove(str);
        } else {
            Map map = r3.A00;
            Set set = (Set) map.get(r7);
            if (set != null) {
                z = set.remove(str);
                if (set.isEmpty()) {
                    map.remove(r7);
                }
            } else {
                z = false;
            }
        }
        if (r3.A01.isEmpty() && r3.A00.isEmpty()) {
            this.mObserverConfigs.remove(notificationCallback);
        }
        return z;
    }

    private void removeScopeFromNativeToJavaMappings(C180418l0 r4) {
        this.mNativeScopeToJavaScope.remove(Long.valueOf(r4.getNativeReference()));
    }

    private void setNativeHolder(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public NotificationCenter(boolean z) {
        this.mNativeScopeToJavaScope = AnonymousClass001.A0t();
        this.mObserverConfigs = AnonymousClass001.A0t();
        this.mMainConfig = AnonymousClass002.A0K();
        if (!z) {
            this.mNativeHolder = initNativeHolder();
        }
    }

    public NotificationCenter() {
        this(false);
    }
}

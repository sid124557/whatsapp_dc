package androidx.multidex;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public final class MultiDex {
    public static final Set A00 = AnonymousClass002.A0K();
    public static final boolean A01;

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x011d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:72:0x0166 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.content.Context r13) {
        /*
            java.lang.String r0 = "Installing application"
            java.lang.String r3 = "MultiDex"
            android.util.Log.i(r3, r0)
            boolean r0 = A01
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = "VM has multidex support, MultiDex support library is disabled."
        L_0x000d:
            android.util.Log.i(r3, r0)
            return
        L_0x0011:
            android.content.pm.ApplicationInfo r1 = r13.getApplicationInfo()     // Catch:{ RuntimeException -> 0x016a }
            if (r1 == 0) goto L_0x0170
            java.lang.String r0 = r1.sourceDir     // Catch:{ Exception -> 0x0176 }
            java.io.File r7 = X.AnonymousClass002.A0B(r0)     // Catch:{ Exception -> 0x0176 }
            java.lang.String r0 = r1.dataDir     // Catch:{ Exception -> 0x0176 }
            java.io.File r5 = X.AnonymousClass002.A0B(r0)     // Catch:{ Exception -> 0x0176 }
            java.lang.String r2 = "secondary-dexes"
            java.util.Set r4 = A00     // Catch:{ Exception -> 0x0176 }
            monitor-enter(r4)     // Catch:{ Exception -> 0x0176 }
            boolean r0 = r4.contains(r7)     // Catch:{ all -> 0x0167 }
            if (r0 != 0) goto L_0x015b
            r4.add(r7)     // Catch:{ all -> 0x0167 }
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0167 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0167 }
            java.lang.String r0 = "MultiDex is not guaranteed to work in SDK version "
            r1.append(r0)     // Catch:{ all -> 0x0167 }
            r1.append(r6)     // Catch:{ all -> 0x0167 }
            java.lang.String r0 = ": SDK version higher than "
            r1.append(r0)     // Catch:{ all -> 0x0167 }
            r0 = 20
            r1.append(r0)     // Catch:{ all -> 0x0167 }
            java.lang.String r0 = " should be backed by "
            r1.append(r0)     // Catch:{ all -> 0x0167 }
            java.lang.String r0 = "runtime with built-in multidex capabilty but it's not the "
            r1.append(r0)     // Catch:{ all -> 0x0167 }
            java.lang.String r0 = "case here: java.vm.version=\""
            r1.append(r0)     // Catch:{ all -> 0x0167 }
            java.lang.String r0 = "java.vm.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch:{ all -> 0x0167 }
            r1.append(r0)     // Catch:{ all -> 0x0167 }
            java.lang.String r0 = "\""
            X.AnonymousClass000.A1F(r0, r3, r1)     // Catch:{ all -> 0x0167 }
            java.lang.ClassLoader r6 = r13.getClassLoader()     // Catch:{ RuntimeException -> 0x014f }
            boolean r0 = r6 instanceof dalvik.system.BaseDexClassLoader     // Catch:{ all -> 0x0167 }
            if (r0 == 0) goto L_0x0156
            if (r6 == 0) goto L_0x015b
            java.io.File r0 = r13.getFilesDir()     // Catch:{ all -> 0x010d }
            java.io.File r8 = X.AnonymousClass002.A0A(r0, r2)     // Catch:{ all -> 0x010d }
            boolean r0 = r8.isDirectory()     // Catch:{ all -> 0x010d }
            if (r0 == 0) goto L_0x0113
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x010d }
            java.lang.String r0 = "Clearing old secondary dex dir ("
            X.AnonymousClass000.A0z(r8, r0, r1)     // Catch:{ all -> 0x010d }
            java.lang.String r9 = ")."
            java.lang.String r0 = X.AnonymousClass000.A0X(r9, r1)     // Catch:{ all -> 0x010d }
            android.util.Log.i(r3, r0)     // Catch:{ all -> 0x010d }
            java.io.File[] r11 = r8.listFiles()     // Catch:{ all -> 0x010d }
            if (r11 != 0) goto L_0x00aa
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x010d }
            java.lang.String r0 = "Failed to list secondary dex dir content ("
            X.AnonymousClass000.A0z(r8, r0, r1)     // Catch:{ all -> 0x010d }
            r1.append(r9)     // Catch:{ all -> 0x010d }
        L_0x00a2:
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x010d }
            android.util.Log.w(r3, r0)     // Catch:{ all -> 0x010d }
            goto L_0x0113
        L_0x00aa:
            int r10 = r11.length     // Catch:{ all -> 0x010d }
            r9 = 0
        L_0x00ac:
            if (r9 >= r10) goto L_0x00ec
            r12 = r11[r9]     // Catch:{ all -> 0x010d }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x010d }
            java.lang.String r0 = "Trying to delete old file "
            X.AnonymousClass000.A0z(r12, r0, r1)     // Catch:{ all -> 0x010d }
            java.lang.String r0 = " of size "
            java.lang.String r0 = X.AnonymousClass000.A0N(r12, r0, r1)     // Catch:{ all -> 0x010d }
            android.util.Log.i(r3, r0)     // Catch:{ all -> 0x010d }
            boolean r0 = r12.delete()     // Catch:{ all -> 0x010d }
            if (r0 != 0) goto L_0x00d9
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x010d }
            java.lang.String r0 = "Failed to delete old file "
            X.AnonymousClass000.A0z(r12, r0, r1)     // Catch:{ all -> 0x010d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x010d }
            android.util.Log.w(r3, r0)     // Catch:{ all -> 0x010d }
            goto L_0x00e9
        L_0x00d9:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x010d }
            java.lang.String r0 = "Deleted old file "
            X.AnonymousClass000.A0z(r12, r0, r1)     // Catch:{ all -> 0x010d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x010d }
            android.util.Log.i(r3, r0)     // Catch:{ all -> 0x010d }
        L_0x00e9:
            int r9 = r9 + 1
            goto L_0x00ac
        L_0x00ec:
            boolean r0 = r8.delete()     // Catch:{ all -> 0x010d }
            if (r0 != 0) goto L_0x00fc
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x010d }
            java.lang.String r0 = "Failed to delete secondary dex dir "
            X.AnonymousClass000.A0z(r8, r0, r1)     // Catch:{ all -> 0x010d }
            goto L_0x00a2
        L_0x00fc:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x010d }
            java.lang.String r0 = "Deleted old secondary dex dir "
            X.AnonymousClass000.A0z(r8, r0, r1)     // Catch:{ all -> 0x010d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x010d }
            android.util.Log.i(r3, r0)     // Catch:{ all -> 0x010d }
            goto L_0x0113
        L_0x010d:
            r1 = move-exception
            java.lang.String r0 = "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning."
            android.util.Log.w(r3, r0, r1)     // Catch:{ all -> 0x0167 }
        L_0x0113:
            java.lang.String r1 = "code_cache"
            java.io.File r0 = X.AnonymousClass002.A0A(r5, r1)     // Catch:{ all -> 0x0167 }
            A02(r0)     // Catch:{ IOException -> 0x011d }
            goto L_0x0128
        L_0x011d:
            java.io.File r0 = r13.getFilesDir()     // Catch:{ all -> 0x0167 }
            java.io.File r0 = X.AnonymousClass002.A0A(r0, r1)     // Catch:{ all -> 0x0167 }
            A02(r0)     // Catch:{ all -> 0x0167 }
        L_0x0128:
            java.io.File r5 = X.AnonymousClass002.A0A(r0, r2)     // Catch:{ all -> 0x0167 }
            A02(r5)     // Catch:{ all -> 0x0167 }
            X.0hy r2 = new X.0hy     // Catch:{ all -> 0x0167 }
            r2.<init>(r7, r5)     // Catch:{ all -> 0x0167 }
            r0 = 0
            java.util.List r0 = r2.A03(r13, r0)     // Catch:{ all -> 0x0162 }
            A03(r5, r6, r0)     // Catch:{ IOException -> 0x013d }
            goto L_0x014b
        L_0x013d:
            r1 = move-exception
            java.lang.String r0 = "Failed to install extracted secondary dex files, retrying with forced extraction"
            android.util.Log.w(r3, r0, r1)     // Catch:{ all -> 0x0162 }
            r0 = 1
            java.util.List r0 = r2.A03(r13, r0)     // Catch:{ all -> 0x0162 }
            A03(r5, r6, r0)     // Catch:{ all -> 0x0162 }
        L_0x014b:
            r2.close()     // Catch:{ IOException -> 0x0160 }
            goto L_0x015b
        L_0x014f:
            r1 = move-exception
            java.lang.String r0 = "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching."
            android.util.Log.w(r3, r0, r1)     // Catch:{ all -> 0x0167 }
            goto L_0x015b
        L_0x0156:
            java.lang.String r0 = "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching."
            android.util.Log.e(r3, r0)     // Catch:{ all -> 0x0167 }
        L_0x015b:
            monitor-exit(r4)     // Catch:{ all -> 0x0167 }
            java.lang.String r0 = "install done"
            goto L_0x000d
        L_0x0160:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0167 }
        L_0x0162:
            r0 = move-exception
            r2.close()     // Catch:{ IOException -> 0x0166 }
        L_0x0166:
            throw r0     // Catch:{ all -> 0x0167 }
        L_0x0167:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0167 }
            throw r0     // Catch:{ Exception -> 0x0176 }
        L_0x016a:
            r1 = move-exception
            java.lang.String r0 = "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching."
            android.util.Log.w(r3, r0, r1)     // Catch:{ Exception -> 0x0176 }
        L_0x0170:
            java.lang.String r0 = "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled."
            android.util.Log.i(r3, r0)     // Catch:{ Exception -> 0x0176 }
            return
        L_0x0176:
            r2 = move-exception
            java.lang.String r0 = "MultiDex installation failure"
            android.util.Log.e(r3, r0, r2)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MultiDex installation failed ("
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = ")."
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.multidex.MultiDex.A01(android.content.Context):void");
    }

    static {
        String str;
        String str2;
        String property = System.getProperty("java.vm.version");
        boolean z = false;
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, ".");
            String str3 = null;
            if (stringTokenizer.hasMoreTokens()) {
                str2 = stringTokenizer.nextToken();
            } else {
                str2 = null;
            }
            if (stringTokenizer.hasMoreTokens()) {
                str3 = stringTokenizer.nextToken();
            }
            if (!(str2 == null || str3 == null)) {
                try {
                    int parseInt = Integer.parseInt(str2);
                    int parseInt2 = Integer.parseInt(str3);
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VM with version ");
        A0o.append(property);
        if (z) {
            str = " has multidex support";
        } else {
            str = " does not have multidex support";
        }
        Log.i("MultiDex", AnonymousClass000.A0X(str, A0o));
        A01 = z;
    }

    public static Field A00(Object obj, String str) {
        Class cls = obj.getClass();
        Class cls2 = cls;
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (declaredField.isAccessible()) {
                    return declaredField;
                }
                declaredField.setAccessible(true);
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Field ");
        A0o.append(str);
        throw new NoSuchFieldException(AnonymousClass000.A0P(cls2, " not found in ", A0o));
    }

    public static void A02(File file) {
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            StringBuilder A0o = AnonymousClass001.A0o();
            if (parentFile == null) {
                AnonymousClass000.A0z(file, "Failed to create dir ", A0o);
                A0o.append(". Parent file is null.");
            } else {
                AnonymousClass000.A0z(file, "Failed to create dir ", A0o);
                A0o.append(". parent file is a dir ");
                A0o.append(parentFile.isDirectory());
                A0o.append(", a file ");
                A0o.append(parentFile.isFile());
                A0o.append(", exists ");
                A0o.append(parentFile.exists());
                A0o.append(", readable ");
                A0o.append(parentFile.canRead());
                A0o.append(", writable ");
                A0o.append(parentFile.canWrite());
            }
            Log.e("MultiDex", A0o.toString());
            StringBuilder A0o2 = AnonymousClass001.A0o();
            AnonymousClass000.A0z(file, "Failed to create directory ", A0o2);
            throw AnonymousClass002.A0C(A0o2.toString());
        }
    }

    public static void A03(File file, ClassLoader classLoader, List list) {
        Object[] objArr;
        if (!list.isEmpty()) {
            Object obj = A00(classLoader, "pathList").get(classLoader);
            ArrayList A0s = AnonymousClass001.A0s();
            ArrayList A0J = AnonymousClass002.A0J(list);
            Class<ArrayList> cls = ArrayList.class;
            Class[] clsArr = {cls, File.class, cls};
            Class cls2 = obj.getClass();
            Class cls3 = cls2;
            while (cls2 != null) {
                try {
                    Method declaredMethod = cls2.getDeclaredMethod("makeDexElements", clsArr);
                    if (!declaredMethod.isAccessible()) {
                        declaredMethod.setAccessible(true);
                    }
                    Object[] objArr2 = (Object[]) declaredMethod.invoke(obj, new Object[]{A0J, file, A0s});
                    Field A002 = A00(obj, "dexElements");
                    Object[] objArr3 = (Object[]) A002.get(obj);
                    Class<?> componentType = objArr3.getClass().getComponentType();
                    int length = objArr3.length;
                    int length2 = objArr2.length;
                    Object newInstance = Array.newInstance(componentType, length + length2);
                    System.arraycopy(objArr3, 0, newInstance, 0, length);
                    System.arraycopy(objArr2, 0, newInstance, length, length2);
                    A002.set(obj, newInstance);
                    if (A0s.size() > 0) {
                        Iterator it = A0s.iterator();
                        while (it.hasNext()) {
                            Log.w("MultiDex", "Exception in makeDexElement", (Throwable) it.next());
                        }
                        Field A003 = A00(obj, "dexElementsSuppressedExceptions");
                        IOException[] iOExceptionArr = (IOException[]) A003.get(obj);
                        int size = A0s.size();
                        if (iOExceptionArr == null) {
                            objArr = A0s.toArray(new IOException[size]);
                        } else {
                            int length3 = iOExceptionArr.length;
                            objArr = new IOException[(size + length3)];
                            A0s.toArray(objArr);
                            System.arraycopy(iOExceptionArr, 0, objArr, A0s.size(), length3);
                        }
                        A003.set(obj, objArr);
                        IOException A0C = AnonymousClass002.A0C("I/O exception during makeDexElement");
                        A0C.initCause((Throwable) A0s.get(0));
                        throw A0C;
                    }
                    return;
                } catch (NoSuchMethodException unused) {
                    cls2 = cls2.getSuperclass();
                }
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Method ");
            A0o.append("makeDexElements");
            A0o.append(" with parameters ");
            A0o.append(Arrays.asList(clsArr));
            throw new NoSuchMethodException(AnonymousClass000.A0P(cls3, " not found in ", A0o));
        }
    }
}

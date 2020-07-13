import matplotlib.pyplot as plt
import pandas as pd
import sys

if len(sys.argv) < 2:
    print("USAGE: python plot.py <label=results.csv...>")
    sys.exit(0)

fig, ax = plt.subplots(figsize=(8, 4))
ax.set_ylabel('Runtime (ms)')
ax.set_yscale('log')
ax.set_xlabel('No. of Repetitions')
ax.set_title('Total Transformation Runtime')

for arg in sys.argv[1:]:
  label, filename = arg.split('=')
  df = pd.read_csv(filename, sep=";")
  plt.plot(df.values[:, 0], df.values[:, 1] / 1000000.0, label=label)

ax.legend()
plt.savefig("runtime.pdf")

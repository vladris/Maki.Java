import jinja2

TEMPLATE_PATH = "./"
SRC_DETAILS_PATH = "../src/com/vladris/poke/details"

templateLoader = jinja2.FileSystemLoader(searchpath=TEMPLATE_PATH)
templateEnv = jinja2.Environment(loader=templateLoader)

template = templateEnv.get_template("TypeGuard.java.template")

for i in range(1, 9):
    with open(f"{SRC_DETAILS_PATH}/TypeGuard{i}.java", "w") as f: 
        f.writelines(template.render(i=i))
